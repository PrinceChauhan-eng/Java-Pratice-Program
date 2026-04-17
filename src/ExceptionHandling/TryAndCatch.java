package ExceptionHandling;

public class TryAndCatch {
    public static void main(String[] args){
        System.out.println("1");
        //Using try & catch to handle the exception

        //Example of correct order (Child first, Parent later)
        try {
            int a = 100 , b=0;
            int c = a/b;
            System.out.println(c);
        }catch (ArithmeticException a){
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e);
        }

        //Example of Incorrect order (Parent first, Child later)
//        try {
//            int a = 10 , b=0;
//            int c = a/b;
//            System.out.println(c);
//        }catch (Exception a){
//            System.out.println(a);
//        } catch (ArithmeticException e) {
//            System.out.println(e);
//        }
    }
}
