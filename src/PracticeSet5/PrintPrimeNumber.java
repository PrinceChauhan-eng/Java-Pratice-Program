package PracticeSet5;
import java.util.*;

public class PrintPrimeNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        for (int n= 2;n<=num;n++){
            boolean isPrime = true;
            for (int i = 2;i<=n/2;i++){
                if (n%i==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(n+", ");
            }
        }
    }
}
