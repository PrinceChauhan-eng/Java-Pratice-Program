import java.util.Scanner;

public class Variables {
    public static void main(String[] args){
        //VARIABLES
        //String name = "Prince";
        // int a = 25;
        //float b = 25.0F;
        // double c = 120.22D;
        // long d = 123456789000L;

        int A = 10;
        int B = 50;
        int sum = A + B;
        //System.out.println(sum);//Addition
        int diff = A- B;
        //System.out.println(diff);//Difference
        int mul = A * B;
        //System.out.println(mul);//Multiplication

        Scanner sc = new Scanner(System.in);
        //String name = sc.next(); // only print first word
        //System.out.println(name);
        //String name = sc.nextLine();
        //System.out.println(name);

        //Sum a & b user input
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter a number");;
        int b = sc.nextInt();
        System.out.println(a+b);
    }
}
