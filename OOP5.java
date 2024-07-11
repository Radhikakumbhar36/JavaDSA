//abstract method
public class OOP5 {
    public static void main(String[] args) {
        
        Son son=new Son(24);
        son.career("Doctor");

        Daughter daughter=new Daughter(23);
        daughter.career("Coder");

        Parent.print();
        son.normal();
    }
    
}

abstract class Parent{
    abstract void career(String name);
    abstract void Partner(String name,int age);
    int age;
    final int Value;

    static void print(){
        System.out.println("Hello");
    }

    void normal(){
        System.out.println("This is the normal method");
    }

    public Parent(int age){
        this.age=age;
        Value=345678;
    }
}

class Son extends Parent{
    public Son(int age){
        super(age);
    }
    
    @Override
    void career(String name){
        System.out.println(" I am going to be a "+ name);
        
    }

    @Override
    void Partner(String name,int age){
        System.out.println("I Love"+name+"he is "+age);
        
    }
} 

class Daughter extends Parent{
    public Daughter(int age){
        super(age);
    }
    @Override
    void career(String name){
        System.out.println("I am going to be Coder");
    }

    @Override
    void Partner(String name,int age){
        System.out.println("I love Peppa Pig");
    }

}

//for abstract you cannot create objects and constructors
//abstract const are not allowed
//abstract methods needs to be overriden 
//can create static method in abstract classes
//we cannot have final abstract classes because final needs to be inherited


//Interface contains abstract functions,It is like a class but not completely
//bydefault functions are public and abstract in interfaces and variables are static 
//variables declared in the interfaces are bydefaault final and in abstract might be final and non final
//using interface you can achieve the multiple inheritance 

public interface Engine {
    static final int price= 7800;
    
   void start();
   void stop();
   

    
}