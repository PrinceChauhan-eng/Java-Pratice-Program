package Constructors;

public class Copy {
    String name;

    Copy(String name){
        this.name=name;
    }
    Copy(Copy q){
        name=q.name;
    }

    static void main(String[] args) {
        Copy c = new Copy("King");
        System.out.println(c.name);

    }
}
