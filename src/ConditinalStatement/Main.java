package ConditinalStatement;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Your Age : ");
        //int age = sc.nextInt();

       /* if (age >18)
            System.out.println("Its adult");
        else
            System.out.println("Not adult");
        */

       /* int x = sc.nextInt();

        if (x % 2 == 0)
            System.out.println("Its a Even Number");
        else
            System.out.println("Its a Odd");

        */

        /*
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("equal");
        }
        else if (a>b) {
            System.out.println("a is greater");
        }
        else
            System.out.println("a is lesser");

         */

        /* int button = sc.nextInt();

        switch (button){
            case 1 :
                System.out.println("Hell0");
                break;
            case 2 :
                System.out.println("Namaste");
                break;
            case 3 :
                System.out.println("Kasakaya");
                break;
            default:
                System.out.println("Invalid button");

         */
        // Create a Calculator

        System.out.println("Enter First Number : ");
        double num1 = sc.nextDouble();

        System.out.println("Enter Operator (+ , - , * ,/ )");
        char cal = sc.next().charAt(0);

        System.out.println("Enter second Number : ");
        double num2 = sc.nextDouble();

        double result = 0;

        switch (cal) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0)
                    result = num1 / num2;

                else {
                    System.out.println("Cannot divide by zero");
                    return;
                }
                break;
            default:
                System.out.println("Invalid Operator");

        }
        System.out.println("Result : " + result);
    }
}


