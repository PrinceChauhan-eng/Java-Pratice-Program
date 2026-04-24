package PracticeSet5;

public class Fibonacci {
    static void main(String[] args) {
        int a = 0, b = 1;
        int n = 10;
        System.out.print("Fibonacci Series are : " + a + " " + b);
        for (int i = 1; i <= n; i++) {
            int sum = a + b;
            System.out.print(" " + sum);
            a = b;
            b = sum;

        }
    }
}
