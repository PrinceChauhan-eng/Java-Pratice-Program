package PracticeSet9;

abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle{
    void start(){
        System.out.println("Car started with key");
    }
}
