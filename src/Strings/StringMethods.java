package Strings;

public class StringMethods {
    static void main(String[] args) {

        //Length() method
        String name ="Prince";
        System.out.println("Length of String : "+name.length());

        //UpperCase() Method
        String a= "king";
        System.out.println("UpperCase of String : "+a.toUpperCase());

        //LowerCase() Method
        String b= "CHAUHAN";
        System.out.println("UpperCase of String : "+a.toUpperCase());

        //Concatenate() Method  using to add at the end of a string
        String c= "Prince";
        System.out.println("Concatenate String : "+c.concat(" Chauhan"));
        System.out.println(a.concat(" More"));

        //SubString() Method
        String d = "I love Java";
        System.out.println(d.substring(7));
        System.out.println(d.substring(2,6));
        System.out.println(d.substring(0,1));

        //IndexOf(Sting s) Method
        String e ="Hello, World!";
        System.out.println(e.indexOf("World"));

        //IndexOf(Sting s,int i) Method
        String f ="Hello, World!";
        System.out.println(e.indexOf("l",4));

        //lastIndexOf(Sting s) Method
        String g ="Hello, World!";
        System.out.println(g.indexOf("l"));

        //Trim Method
        String t ="   Hello, World!   ";
        System.out.println("'"+t.trim()+"'");

        //Replce() Method
        String r =" Hello World";
        System.out.println(r.replace("World","Java"));

        //Contain Method use to see a string present is or not
        String j = "Hello World";
        System.out.println(j.contains("Hel"));

    }
}
