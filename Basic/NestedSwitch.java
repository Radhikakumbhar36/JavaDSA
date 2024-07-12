package Basic;
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int empID=in.nextInt();
        String department=in.next();
        switch (empID) {
            case 1:
                System.err.println("Radhika Kumbhar");
                break;
            case 2:
                System.out.println("Sakshi talekar");
                break;
            case 3:
                System.out.println("Emp no 3");
                switch(department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management");
                        break;
                    default:
                        System.out.println("No department found");
                    }
                    break;
            default:
                    System.out.println("enter the empID correctly");

                
        
            
        }
    }
    
}
