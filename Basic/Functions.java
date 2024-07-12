package Basic;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        sum();    //only static methods can use in static 
    //    int ans= sum2();
    //    System.out.println(ans);
       System.out.println(sum2());
       Scanner in =new Scanner(System.in);
      
       System.out.println("Enter your name");
       String name=in.next();
       String person=myGreet(name);
       System.out.println(person);
    }

    static void sum(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number 1:");
        int num1=in.nextInt();
        System.out.println("Enter the number 2:");
        int num2=in.nextInt();
        int sum=num1+num2;
        System.out.println("The Sum:"+sum);

    }
    static int sum2(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number 1:");
        int num1=in.nextInt();
        System.out.println("Enter the number 2:");
        int num2=in.nextInt();
        int sum=num1+num2;
        // System.out.println("The Sum:"+sum);
        return sum;
        //System.out.println("This statement will never execute after return ");


    }

    //argument passing
    static String myGreet(String name){
        String message ="hello"+name;
        return message;

    }
    
}
