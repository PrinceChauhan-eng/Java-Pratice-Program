package ExceptionHandling;

public class Test {
    public static void main(String[] args){
        System.out.println("1");
        try {
            int a = 100 , b=0;
            int c = a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
