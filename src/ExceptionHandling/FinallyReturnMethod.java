package ExceptionHandling;

public class FinallyReturnMethod {
    static String m1(){
        try {
            System.out.println("Inside try");
            return "Returning from try" ;
        }catch (ArithmeticException e){
            return  "Return from catch" ;
        }
        finally {
            System.out.println("Finally block execute before return");
        }
    }
    public static void main(String[] args){
        System.out.println(m1());

    }
}
