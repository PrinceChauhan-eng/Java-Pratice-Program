package JavaExecrise;

import java.util.*;

import static java.lang.Math.PI;

public class JavaExecrise {
    //Enter 3 numbers from the user & make a function to print their average.
    public static int Average(int a, int b, int c) {
        int Avg = (a + b + c) / 3;
        return Avg;
    }

    //Write a function to print the sum of all odd numbers from 1 to n.
    public int CountSumOdd(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                // sum of odd num
                count = count + i;

                // sum of odd number count
                //count++;
            }
        }
        return count;
    }

    //Write a function which takes in 2 numbers and returns the greater of those two.
    public static void printGreaternumber(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

    }

    //Write a function that takes in the radius as input and returns the circumference of a circle.
    public static double circumferenceOfCircule(int a) {
        // float pi = 3.14F;
        double circule = 2 * PI * a;
        return (circule);

    }

    //Write a function that takes in age as input and returns if that person is eligible to vote or not.
// A person of age > 18 is eligible to vote.
    public static boolean age(int a) {
        if (a >= 18) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

//       Scanner sc= new Scanner(System.in);
//        System.out.print("Enter a age : ");
//        int a = sc.nextInt();
//        System.out.print("Enter Second number : ");
//        int b = sc.nextInt();
//        System.out.print("Enter Third number : ");
//        int c = sc.nextInt();
//
//        int avg=Average(a,b,c);
//        System.out.println("The Average of Number is :"+avg);

//        JavaExecrise result = new JavaExecrise();
//        int results = result.CountSumOdd(a);
//        System.out.println(results);
//        printGreaternumber(a,b);
        ;
//        System.out.println("circumference Of Circule is "+circumferenceOfCircule(a));

//        boolean result = age(a);
//        if(result){
//            System.out.println("It is Eligible to vote");
//        }
//        else {
//            System.out.println("It's not Eligible to vote");
//        }

        //Write an infinite loop using do while condition.
//        do {
//            System.out.println("Infinite loop");
//        }while (true);


        //Write a program to enter the numbers till the user wants and at
        //the end it should display the count of positive, negative and zeros entered.

//        Scanner sc = new Scanner(System.in);
//
//        int num, positive = 0, negative = 0, zero = 0;
//        char choice;
//        do {
//            System.out.print("Enter a Number : ");
//            num = sc.nextInt();
//            if (num > 0) {
//                positive++;
//            } else if (num < 0) {
//                negative++;
//            } else {
//                zero++;
//            }
//            System.out.print("Do you want to Continue (y/n) :");
//            choice = sc.next().charAt(0);
//
//        } while (choice == "y" || choice == "Y");
//        System.out.println("Result ");
//        System.out.println("Positive Number :" + positive);
//        System.out.println("Negative Number :" + negative);
//        System.out.println("Zero Number :" + zero);
//        sc.close();

    }
}


