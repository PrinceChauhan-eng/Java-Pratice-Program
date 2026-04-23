package PracticeSet5;

public class PlaindromeNumber {
    static void main(String[] args) {
        int num = 12321;
        int temp = num;
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;

        }
        if (temp==rev){
            System.out.println("It is a Palindrome Number");
        }
        else {
            System.out.println("It is not a Palindrome Number");
        }
    }
}
