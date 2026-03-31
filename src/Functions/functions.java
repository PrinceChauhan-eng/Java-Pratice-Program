package Functions;

import java.util.*;

public class functions {
    public static int Calsum(int a,int b){
        int sum = a + b;
        return sum;
    }
public static int Multi(int a , int b){
        int mul = a*b;
        return mul;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a =sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b =sc.nextInt();

       // int sum = Calsum(a,b);
       // System.out.println(sum);

        int mul =Multi(a,b);
        System.out.println("Sum of A and B is "+mul);
    }



}
