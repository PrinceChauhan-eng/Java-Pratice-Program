package string;

import javax.xml.transform.Source;

public class Strings {
    public static void main(String[] args){
        // Concatenate String
        String name1 = "Prince";
        String name2 = "Chauhan";
        String name3 = name1 +" "+ name2;
        System.out.println(name3);
        //ChartAt
        String name = "PRINCE Chauhan";
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(5));
        //Length
        String name4 ="I love java";
        System.out.println(name4.length());
        //Replace
        System.out.println(name1.replace("P","V"));
        System.out.println(name2.replace("C","M"));
        //SubString
        System.out.println(name.substring(0,4));
        System.out.println(name.substring(0,6));
    }
}
