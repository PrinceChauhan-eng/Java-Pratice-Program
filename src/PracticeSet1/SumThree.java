package PracticeSet1;

import java.util.*;

public class SumThree {
    //Q1: Sum of Three Numbers
//    int sum(int a ,int b ,int c){
//        return a+b+c;
//    }
//
//    static void main(String[] args) {
//        PracticeSet1 p = new PracticeSet1();
//        System.out.println("Sum of a b and c is : "+p.sum(10,52,98));
//
//    }
    //User input
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2 number : ");
        int b = sc.nextInt();
        System.out.println("Enter 3 number : ");
        int c = sc.nextInt();

        int sum = a + b + c;
        System.out.println("Sum is : " + sum);

    }
}
