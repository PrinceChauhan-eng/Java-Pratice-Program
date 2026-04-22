package PracticeSet5;

import java.util.*;

public class SumEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sum =0;
        for (int i =1;i<=n;i++){
            if (i%2==0){
                sum+=i;
            }
        }
        System.out.println("Sum on Even number is : "+sum);

//        int i = 1, sum = 0;
//
//        while (i <= n) {
//            if (i % 2 == 0) {
//                sum = sum + i;
//            }
//            i++;
//        }

        System.out.println("Sum of Even Number = " + sum);
    }

}
