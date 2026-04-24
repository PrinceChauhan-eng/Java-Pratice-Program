package PracticeSet5;

public class SwapTwoNumber {
    static void main(String[] args) {
        int a = 10 , b=20;
        //Swapping Using Third Variable
        System.out.println("Before Swapping A = "+a+" and B = "+b);
//        int c = a;
//        a=b;
//        b=c;

        //Without using third Variable
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After Swapping A = "+a+" and B = "+b);
    }
}
