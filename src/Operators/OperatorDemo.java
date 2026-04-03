package Operators;

public class OperatorDemo {
    public static void main(String args[]) {
        int a = 10;
        int b = 25;
        //---------------Arithmetic Operators-------------
        System.out.println("a+b = " + (a + b)); // Addition
        System.out.println("a-b = " + (a - b)); // Substraction
        System.out.println("a*b = " + (a * b)); // multiplication
        System.out.println("a/b = " + (a / b)); // Division

        //---------------Relational Operators---------------
//        System.out.println("a>b ? ", +(a > b)); // Greater then
//        System.out.println("a<b ? ", +(a < b)); // Less then

        //---------------Logical Operator-------------------
        boolean x = true; boolean y = false;
        System.out.println("X && Y ="+(x&&y)); // And Operator
        System.out.println("X || Y ="+(x||y)); // OR Operator

        // Assignment Operator
        a +=5;
        System.out.println("a after a+=5 : "+a);
    }
}
