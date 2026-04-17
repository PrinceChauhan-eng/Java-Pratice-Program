package Interface;

interface I1{
    void m1();
}
interface I2{
    void m2();
}

class A implements I1,I2{

    public void m1() {
        System.out.println("M1 method is call");
    }

    public void m2() {
        System.out.println("M2 method is call");
    }
}


public class MultipleInheritance {
    public static void main(String[] args){
        A a = new A();
        a.m1();
        a.m2();
    }
}
