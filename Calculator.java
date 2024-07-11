
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.println("Enter the operator (+, -, *, /, %) or 'X' to exit:");
            char op = in.next().trim().charAt(0);

            if (op == 'X' || op == 'x') {
                break;
            }

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter two numbers:");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                switch (op) {
                    case '+':
                        ans = num1 + num2;
                        break;
                    case '-':
                        ans = num1 - num2;
                        break;
                    case '*':
                        ans = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            ans = num1 / num2;
                        } else {
                            System.out.println("Division by zero is not allowed.");
                            continue;
                        }
                        break;
                    case '%':
                        ans = num1 % num2;
                        break;
                    default:
                        System.out.println("Invalid operation");
                        continue;
                }
                System.out.println("The result is: " + ans);
            } else {
                System.out.println("Invalid operator. Please enter a valid operator.");
            }
        }
        in.close();
    }
}
