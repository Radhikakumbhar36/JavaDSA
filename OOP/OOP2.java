package OOP;
public class OOP2 {
    static class Test{
        String name;

        Test(String name){
            this.name=name;
        }

    }

    public static void main(String[] args) {
        Test t=new Test("Kunal"); //you cannot access the inner class without static
        //cause iit is dependent on outer class so make it static
        //and you cannot make outer class as a static 
        //only inner class can make it as a static
        System.out.println(t.name);
        Test t2=new Test("Radha");
        System.out.println(t2.name);

    }
    
}

