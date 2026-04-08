package PracticeSet1;
import java.util.*;

public class CGPA {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you English Marks : ");
        int a = sc.nextInt();
        System.out.println("Enter you Math Marks : ");
        int b =sc.nextInt();
        System.out.println("Enter you Science Marks : ");
        int c =sc.nextInt();

        int cgpa=(a+b+c)/3;

        System.out.println("Your CGPA is : "+cgpa);
    }
}
