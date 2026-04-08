package PracticeSet5;
import java.util.*;

public class EvenSum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of Even Number is : " + sum);

    }
}
