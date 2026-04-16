package ExceptionHandling;

public class Finally {
    public static void main(String[] args){
        try{
            System.out.println("Inside try block ");
            int a =100 , b=0;
            int result = a/b;
            System.out.println("Result : "+result);
        }catch (ArithmeticException e){
            System.out.println("Exception Caught : "+e);
        }finally {
            System.out.println("Finally block always execute");
        }
        System.out.println("Rest of Code");
    }
}
