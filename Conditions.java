import java.util.Scanner;


public class Conditions {
    public static void main(String[] args) {
        // int salary=20000;
        // if(salary>10000){
        //     salary+=2000;
        // }
        // else if(salary>20000){
        //     salary+=3000;

        // }
        // else{
        //     salary+=1000;
        // }
        // System.out.println(salary);


        // for (int i=1;i<=10;i++){
        //     System.out.println(i);
        // }
        // int i=1;
        // while(i<=10){
        //     System.out.println(i);
        //     i++;
        // }

        // do{ 
        //     System.out.println(i);
        //     i++;
        // } while(i<=10);


        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=a;
        if(b>max) max=b;
        if(c>max) max=c;
        System.out.println(max);

        int mac=Math.max(c, Math.max(a, b));
        System.out.println(mac);
        


        //Trim and checking lower and upper case
        String word="hello";
        System.out.println(word.charAt(0));
        System.out.println(sc.next().trim());
        //trim excutes extra spaces whitespaces form beginning and last
        char ch=sc.next().trim().charAt(0);
        if(ch>='a'&& ch<='z'){
            System.out.println("Lowercase");

        }else{
            System.out.println("Uppercase");
        }


        
    }


}
