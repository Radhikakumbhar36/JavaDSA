class Student{
    int rollno;
    String name;
    float marks;

    // Student(){
    //     this.rollno=1;
    //     this.name="Radha";
    //     this.marks=90.0f;

    // }
    Student(int rollno,String name,float marks){
             this.rollno=rollno;
             this.name=name;
             this.marks=marks;
    }
    Student(){
        //this is how you call a constructor from another constructor
        //internally it will be new Student(13,"default person",100.0f);
        this(13,"default person",100.0f);
    }
    

    //constructor is used only of assigning value;

    void greeting(){
        System.out.println("hello my name is "+ this.name);
        //this is replaced with s1 to access the value of object
    }
}
public class OOP1 {
    public static void main(String[] args) {
        Student s1 = new Student(12,"Radha",90);
    //    s1.greeting();
    //    System.out.println(s1.name);
    //    System.out.println(s1.rollno);
    //    System.out.println(s1.marks);
    Student random=new Student();
    System.out.println(random.name);
    System.out.println(random.rollno);
    System.out.println(random.marks);
    // final String name;
    // name="radha";
    // System.out.println(name);
    // final int main;
    // main=10;
      

    }
    
}
