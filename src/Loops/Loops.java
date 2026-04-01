package Loops;
import java.util.*;
import javax.xml.transform.sax.SAXResult;

public class Loops {
    public static void main(String[] args) {

        // 1. For loops
        System.out.println("For Loops");
        for(int i=1;i<=5;i++){
            System.out.println("i = "+i);
        }

        // 2. While Loops
        System.out.println("While Loops");
        int i =1;
        while (i<=5){
            System.out.println("i = "+i);
            i++;
        }

        // 3. Do while loops
        System.out.println("Do Whiile Loops");
        int j = 1;
        do {
            System.out.println("j = "+j);
            j++;
        }while (j<=5);

        // 4. Enhanced For Loop (for-each loop)
        System.out.println("Enhance For Loop");
        int [] num ={100,200,300,400,500};
        for (int k : num){
            System.out.println("num ="+j);

        }


//        //For Loops
//
//        for (int counter = 0; counter < 5; counter++) {
//            System.out.println(counter + " ");
//
//        }
//
//        for (int i = 0; i < 11; i++)
//            System.out.println(i + " ");
//
//
//        //While Loops
//        int i = 0;
//        while (i < 10) {
//            System.out.println(i);
//            i++;
//        }
//
//
//        // Do while Loops
//        int j = 0;
//        do {
//            System.out.println(j);
//            j++;
//        } while (j < 15);
//
//
//
//        // Do While different way  (In do while loop first it will print then checking a condition)
//       /* int k = 12;
//        do {
//            System.out.println("Hello World");
//        }while (k < 11);
//
//    // Check Prime Number
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Number : ");
//        int num = sc.nextInt();
//
//        */
//
//    //Sum of n Natural number user input
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Table Number :");
//        int n = sc.nextInt();
//       /* int sum = 0 ;
//
//        for (i=1;i<=n;i++){
//            sum = sum + i;
//        }
//        System.out.println(sum);
//
//        */
//        for (i=1;i<=10;i++){
//            System.out.println(n+" x "+ i+ " = "+(n*i));
//        }

    }
}

