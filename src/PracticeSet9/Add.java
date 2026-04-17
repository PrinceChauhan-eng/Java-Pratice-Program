package PracticeSet9;

import java.util.Arrays;

//Overloading Method
class Add {
    int add(int a, int b) {
        return a + b;
    }
}

class Sub extends Add{
    int add(int a , int b , int c){
        return a+b+c;
    }

    static void main(String[] args) {
        Sub s = new Sub();
        int r=new Sub().add(4,5);
        System.out.println(r);

    }


}


