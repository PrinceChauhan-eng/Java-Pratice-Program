package Methods;

public class MultipleMethods {
    //Static Method
    public static void D() {
        float f = 120.26f;
        System.out.println("In Method D");
    }
    //Static Method
    public static void C() {
        Double D = 120.26545565D;
        System.out.println("In Method C");
    }
    //Instance Method
    public  void B() {
        int a = 120;
        C();
        System.out.println("In Method B");

    }
    //Instance Method
    public  void A() {
        int b = 100;
        B();
        System.out.println("In Method A");
    }
    public static void main(String[] args){
            MultipleMethods a = new MultipleMethods();
            a.A();
            a.D();
            MultipleMethods.D();
    }
}
