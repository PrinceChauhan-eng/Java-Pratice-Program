package ExceptionHandling;
import java.util.*;

class YoungerAgeException extends  Exception{
    public YoungerAgeException(String msg){
        super(msg);
    }
}


public class Throw {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you age : ");
        int age = sc.nextInt();
        try {
            if (age <= 18) {
                throw new YoungerAgeException("Your are not Eligible for Vote");
            } else {
                System.out.println("You are Eligible for Vote");
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }

}