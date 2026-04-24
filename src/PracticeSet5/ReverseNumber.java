package PracticeSet5;

public class ReverseNumber {
    static void main(String[] args) {
        int num = 54215;
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;

        }
        System.out.println("Reverse : " + rev);
    }
}
