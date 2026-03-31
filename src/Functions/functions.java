package Functions;

import java.util.*;

public class functions {
    public static int Calsum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int Multi(int a, int b) {
        int mul = a * b;
        return mul;

    }

    public static void printFactorial(int n) {
        if (n<0){
            System.out.println("Invalid Number");
            return;
        }
        int Factorial = 1;

        for (int i = n; i >= 1; i--) {
            Factorial = Factorial * i;
        }
        System.out.println(Factorial);
        return;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter First Number : ");
        //int a = sc.nextInt();
        //System.out.print("Enter Second Number : ");
        //int b = sc.nextInt();

        // int sum = Calsum(a,b);
        // System.out.println(sum);


        //int mul = Multi(a, b);
        //System.out.println("Sum of A and B is " + mul);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        printFactorial(n);
    }


}
