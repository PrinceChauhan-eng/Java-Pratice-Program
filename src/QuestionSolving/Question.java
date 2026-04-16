package QuestionSolving;

import java.util.*;

public class Question {
    public static void main(String[] args) {
        //Check Even or Odd Number
        //Scanner sc = new Scanner(System.in);
        /*
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if (num%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");

         */

        //Check Positive, Negative or Zero
        /*
        System.out.println("Enter Number :");
        double i = sc.nextDouble();

        if (i>0)
            System.out.println("Its a positive number");
        else if (i<0) {
            System.out.println("Its a Negative number");

        }
        else
            System.out.println("Its a Zero");

         */


        //. Find Largest of Two Numbers
        /*
        System.out.println("Enter a first number :");
        double num = sc.nextDouble();

        System.out.println("Enter a second number");
        double num1 = sc.nextDouble();

        if (num>num1)
            System.out.println(" A is greater ");
        else
            System.out.println("B is greater ");

         */

        //Find Largest of Three Numbers
        /*
        System.out.println("Enter a first number :");
        double num = sc.nextDouble();

        System.out.println("Enter a second number");
        double num1 = sc.nextDouble();

        System.out.println("Enter a third number");
        double num2 = sc.nextDouble();

        if (num>num1 && num>num2)
            System.out.println(" A is greater ");
        else if (num1 > num && num1 >num2)
            System.out.println("B is greater");
        else
            System.out.println("C is greater");

         */

        //Check Leap Year
       /* System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if (num%4==0)
            System.out.println("leap Year");
        else
            System.out.println("Not a Leap Year");

        */
        //Solid Rectangle pattern
        /*for(int i =1; i<=4;i++){
            //System.out.println("*");
            for (int j = 1; j<=5;j++){
                System.out.print("*");
            }
            System.out.println(" ");
            }

         */
        //Hollow rectangle pattern
        /*int n = 4;
        int m = 5;
        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= m; j++) {
                //cell(i,j)
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

         */

        //Half Pyramid pattern
//        int o = 4;
//        for (int i = 1; i <= o; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println(" ");
//
//        }
//


        //Reverse Half Pyramid pattern
        /*
        int n = 4;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");

            }
            System.out.println("*");

         */


        //inverted Half Pyramid pattern
        /*int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

         */
        //Half Pyramid with Number
        /*
        int n = 5;
        for(int i =1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();


         */
        // inverted Half Pyramid with number
//        int n = 5;
//        for (int i=n+1;i>=1;i--){
//            for (int j =1;j<=i-1;j++){
//                System.out.print(j+" ");
//
//            }
//            System.out.println();
//        }


//        int n = 5;
//        int num = 1;
//        for (int i = 1; i <= n; i++) {
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print(num + " ");
//                num++;
//            }
//            System.out.println();
//        }


        //0-1 triangle
        /*
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int num =i+j;
                if (num%2==0){
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }

            }
            System.out.println();
        }

         */
        //Butterfly pattern
         /*
        int n = 4;
        //Upper Half
        for (int i = 1; i <= n; i++) {
            //1 part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //Space
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            //2 part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            }
        //Lower half
        for (int i = n; i >= 1; i--) {

            //1 part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //Space

            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            //2 part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

            */
        //Solid Rhombus
       /*
            int m = 4;
            for (int i = m;i>=1;i--){
                for(int j =1;j<=i;j++){
                    System.out.print(" ");
                    }
                for (int j=1;j<=m;j++){
                    System.out.print("*");
                }
                System.out.println();
            }

        */


//        //Number pyramid
//        int n = 4;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//
////        }
        //palindromic Pattern
        int m = 4;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();

        }

            //Diamond Pattern
//        int p = 4;
//        //First Half Diamond
//        for (int i = 1; i <= p; i++) {
//            for (int j = 1; j <= p - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = i; j >= 1; j--) {
//                System.out.print("*");
//            }
//            for (int j = 2; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        //Second Half Diamond
//        for (int i = p; i >= 1; i--) {
//            for (int j = 1; j <= p - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = i; j >= 1; j--) {
//                System.out.print("*");
//            }
//            for (int j = 2; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        int l = 4;
//        for (int i = 1; i <= l; i++) {
//            for (int k=1;k<=l-i;k++){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=2*i-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
        }
    }



