package PracticeSet1;
import java.util.*;

public class CheckInteger {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        if (sc.hasNextInt()){
            System.out.println("Its a Integer");
        }
        else {
            System.out.println("Its not a Integer");
        }
    }
}
