import java.util.Scanner;

public class Variables {
    // instance variable ( belong to each object)
    int instance = 10;

    //Static Variable ( shared across all object of the class)
    static String name= "Hello world";

    public void showVaribale(){
        // local variable ( decalre inside a method)
        int Localvar = 50;
        System.out.println("Instance Variavle "+instance);
        System.out.println("String Variavle "+name);
        System.out.println("Local Variavle "+Localvar);
    }

    public static void main(String[] args){
        // Creating Object
        Variables vb = new Variables();
        vb.showVaribale();
        // Accessing static variable direct using class name
        System.out.println("Accessing static Variable "+Variables.name);

    }
}
