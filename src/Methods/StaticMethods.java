package Methods;

class StaticMethods {
    static void hello(){
        System.out.println("Hello Java");

    }
    public static void main(String[] args){
        StaticMethods.hello(); //  Static methods belong to the class, not the object.
        // They can be called without creating an object.
    }
}
