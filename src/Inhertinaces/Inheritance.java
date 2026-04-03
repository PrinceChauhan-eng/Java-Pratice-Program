package Inhertinaces;


// Parent Class
class Inheritance {
    void sound() {
        System.out.println("Animal make a sound");
    }
}

class Dog extends Inheritance {
    void sound() {
        System.out.println("Dog are barking");
    }
}

class Cat extends Inheritance {
    void sound() {
        System.out.println("Cat Meow");
    }
}

class Cow extends Inheritance {
    void sound() {
        System.out.println("Cows");
        ;
    }
}

class Main {
    static void main(String[] args) {
        Inheritance a;
        a = new Dog();
        a.sound();
        a = new Cat();
        a.sound();
        a = new Cow();
        a.sound();
    }

}
