package PracticeSet4;
import java.util.*;

public class PassandFail {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Science marks: ");
        float a = sc.nextFloat();
        System.out.println("Enter a maths marks : ");
        float b=sc.nextFloat();
        System.out.println("Enter a Hindi Marks : ");
        float c = sc.nextFloat();

        if (a>40 && a>=33 && b>40 && b>=33 && c>40 && c>=33 ){
            System.out.println("Pass");
            }
        else {
            System.out.println("fail");
        }

    }

}
