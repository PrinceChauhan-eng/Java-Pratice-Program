package MultiThreading;

class Test6 extends Thread{
    public void run(){
        if (Thread.currentThread().isDaemon()){
            System.out.println("Daemon Thread");
        }
        else {
            System.out.println("Child Thread");
        }
    }

}

public class DaemonThread {
    static void main(String[] args) {
        System.out.println("Main Thread");
        Test6 test6 = new Test6();
        //test6.setDaemon(true);
        test6.start();

    }
}
