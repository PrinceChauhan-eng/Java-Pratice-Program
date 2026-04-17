package PracticeSet10;

public class Prime {
    static void main(String[] args) {
//        int num = 3;
//        if (num <= 1) {
//            System.out.println(num + "not a prime number");
//            return;
//        }
//        boolean isPrime = true;
//        for (int i = 2; i < num / 2; i++) {
//            if (num % i == 0)
//            {
//                isPrime = false;
//                break;
//            }
//        }
//        if (isPrime) {
//            System.out.println(num+" its a Prime Number");
//        } else {
//            System.out.println(num+" its not a Prime Number");
//        }


        System.out.print("Prime number between 1 to 100 are : ");
        for (int num = 2; num <= 100; num++) {
            boolean isPrimes = true;
            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0) {
                    isPrimes = false;
                    break;
                }
            }
            if (isPrimes) {
                System.out.print(num + " ");
            }
        }

    }
}


