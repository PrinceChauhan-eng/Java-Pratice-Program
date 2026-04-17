package ControlStatement;
import java.util.*;

public class LoopingStatement {
    public static void main(String[] args){
        // For Loop --------------------------------using to repeat code multiple time
        for (int i =1;i<=5;i++)
            System.out.print(i+ " ");

        //While Loop
        //Task - Print all the even numbers between 1 and 17
        int no =2;
        while (no <= 17){
            System.out.println("Even Number: "+no);
            no = no+2;
        }

        //Do while Loop
        //Task -  The user will provide an input, and we need to check
        // whether it is a positive or negative number.
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter a Positive Number : ");
            num = sc.nextInt();
        } while (num<=0);
            System.out.println("You have Enter a Valid Positive Number "+num);

        //For-Each Loop

        String[] friuts = {"Apple","Banana","Mango"};
        for (String name : friuts)
            System.out.print(name+" ");

    }
}
