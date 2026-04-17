package OOPS;

class Main {
    static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.deposit(10000);
        e.withdraw(1200);
        System.out.println("Your Balance : "+e.getBalance());
        Animal a  = new Horse();
        a.eat();
        a.walk();
        Horse h = new Horse();
        h.talk();


    }
}
