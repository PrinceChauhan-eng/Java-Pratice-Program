package PracticeSet9;

class Animal {
    void breed(){
        System.out.println("Indian Breed");
    }

}

class Dog extends Animal{
    void sound(){
        System.out.println("There sound is like a lion  ");
    }

    static void main(String[] args) {
        Dog d = new Dog();
        d.breed();
        d.sound();
    }
}


