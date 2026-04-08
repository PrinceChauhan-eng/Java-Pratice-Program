package TypeCasting;

import java.util.Arrays;

public class StringtoArray {
    static void main(String[] args) {

        //Int to String
        int [] arr={4,5,6,};
        String a1 = Arrays.toString(arr);
        System.out.println(a1);

        //String to Array
        String name= "Prince";
        char[] ch2=name.toCharArray();
        System.out.println(ch2);

        //Array to String
        String[] arr2={"Hello"};
        String p = Arrays.toString(arr2);
        System.out.println(p);

    }


}
