package PracticeSet2;
import javax.swing.*;
import java.util.*;

public class CompareNumber {

    static void main(String[] args) {
        int b=20;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a =sc.nextInt();
        if(a<b){
            System.out.println("Given number is greater");
        }
        else {
            System.out.println("User number is greater");
        }
    }



}
