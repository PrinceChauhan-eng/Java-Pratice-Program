package MultiThreading;

public class Test1 extends Thread{
    //Performing single task from Multiple thread

    public void run(){
        System.out.println("Thread created");
    }


    static void main(String[] args) {
        Test1 t = new Test1();
        t.start();
        Test1 t1 = new Test1();
        t1.start();
    }
}
