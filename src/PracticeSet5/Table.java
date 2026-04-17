package PracticeSet5;

import java.util.*;

public class Table {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Table Number : ");
        int n = sc.nextInt();
//        int sum =0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n+ "X" +i+"="+n*i);
        }

    }
}
