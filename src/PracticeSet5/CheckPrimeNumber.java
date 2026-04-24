package PracticeSet5;

public class CheckPrimeNumber {
    static void main(String[] args) {
        int no = 10;
        if (no<=1){
            System.out.println("Its not a Prime number");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i < no; i++) {
            if (no % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println("Its a prime number");
        }else {
            System.out.println("Its not a prime Number");
        }
    }
}
