package Abstract;

abstract class Vehicle {
    int no_of_tyres;

    void displayTyres() {
        System.out.println("Vehicle has " + no_of_tyres + " Tyres");
    }

    abstract void start();

}

////Overidding Abstract Method
//abstract class Scooty extends Vehicle {
//    void displayTyres() {
//        System.out.println("Scooty has " + no_of_tyres + " Tyres");
//    }
//}

class Car extends Vehicle {
    Car() {
        no_of_tyres = 4;
    }

    void start() {
        System.out.println("Car start with key");
    }
}

class Bike extends Vehicle {
    Bike() {
        no_of_tyres = 2;
    }

    void start() {
        System.out.println("Bike Start with kick");
    }
}


public class Main {
    public static void main(String[] args) {
        Vehicle c = new Car();
        Vehicle b = new Bike();
        c.displayTyres();
        c.start();
        b.displayTyres();
        b.start();
    }
}
