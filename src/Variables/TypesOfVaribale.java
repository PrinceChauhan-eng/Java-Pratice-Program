package Variables;

public class TypesOfVaribale {
    //Instance Variable
    int no =100;

    //Static Variable
    static int no1 =50;

    void m1(){
        //Local Variable
        int no2=5;
        System.out.println("Result 1 : "+(no2+no));
        System.out.println("Result 2 : "+(no2+no1));
       // System.out.println("Result 3 : "+(no2+no3)); Error no3 is a local variable present in method m2()
        //thus cannot use outside the m2() method
    }
    void m2(){
        int no3 = 78;
        System.out.println("Result 4 : "+(no3+no));
        System.out.println("Result 5 : "+(no3+no1));
        //System.out.println("Result 6 : "+(no3+no2));Error no3 is a local variable present in method m1()
        //        //thus cannot use outside the m1() method

    }
    static void m3(){
        int no4=55;
       // System.out.println("Result 7 : "+(no+no1));Error  because no is instance variable
        // which cannot be used inside static method
        System.out.println("Result 8 : "+(no4+no1));
        //System.out.println("Result 9 : "+(no1+no2+no3)); Error because no1 and no2 are local variables
        // And cannot be used outside their method
    }

    static void main(String[] args) {
        TypesOfVaribale tp = new TypesOfVaribale();
        tp.m1();
        tp.m2();
        TypesOfVaribale.m3();
    }

}
