package Inhertinaces;

class Single_Inheritance {
    Single_Inheritance(){
        System.out.println("This is Vehicle ");
    }
}

class  Car extends Single_Inheritance{
    Car(){
        System.out.println("This is Vehicle Car");
    }

}
class Test{
    static void main(String[] args) {
        Car c= new Car();
    }
}