package MultiThreading;

public class Test extends Thread{
    //Performing single task from single thread

    public void run(){
        System.out.println("Thread created");
    }


    static void main(String[] args) {
        Test6 t = new Test6();
        t.start();
        t.start();
    }
}
