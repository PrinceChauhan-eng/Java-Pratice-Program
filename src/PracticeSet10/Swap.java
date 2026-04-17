package PracticeSet10;
import java.util.*;

public class Swap {
    public static void main(String[] args) {
        int a = 10 ,b=20;
        System.out.println("Before Swapping a :"+a+", b : "+b);
        a= a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping a : "+a+", b: "+b);


        //Print Factorial Number User Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int fact = 1;
        for (int i =1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is : "+fact);

        //Reverse Number
        int no =52325;
        int orginal= no;
        int reverse =0;
        while (no!=0){
            int digit = no%10;
            reverse = reverse*10 + digit;
            no = no/10;
        }
        if (orginal==reverse){
            System.out.println("Its a Palindrome");
        }
        else {
            System.out.println("Its not a Palindrome");
        }



    }

}
