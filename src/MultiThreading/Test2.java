package MultiThreading;

class Test3 extends Thread {
    public void run() {
        System.out.println("Playing Video");
    }
}

class Test4 extends Thread{
    public void run(){
        System.out.println("Playing Music");
    }
}

class Test5 extends Thread{
    public void run(){
        System.out.println("Timer Start");
    }
}

public class Test2 extends Thread {
    //Performing Multiple task from single thread

    public void run() {
        System.out.println("Thread created");
    }

    static void main(String[] args) {
        Test3 test3 = new Test3();
        test3.start();
        Test2 test2 = new Test2();
        test2.start();
        Test4 test4 = new Test4();
        test4.start();
        Test5 test5 = new Test5();
        test5.start();
    }
}

