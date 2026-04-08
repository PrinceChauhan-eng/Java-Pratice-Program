package PracticeSet9;

public class Main1 {
    static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(10000);
        ba.withdraw(5000);
        System.out.println("Your balance is : "+ba.getBalance());

//        Sub c = new Sub();
//        Car c = new Car();
//        c.start();

//        System.out.println(c.add(4,5));
//        System.out.println(c.add(5,8,9));


//
//        Student s = new Student();
//        s.setAge(25);
//        s.setName("Prince");
//        System.out.println(s.getName()+" your age is : "+s.getAge());
    }
}
