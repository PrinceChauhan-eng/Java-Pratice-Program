package MultiThreading;

class CheckCurrenThread extends Thread{
    public void run(){
//        Thread t = new Thread();
//        t.setName("Thread - 1");
        System.out.println("Hello");
        System.out.println(getName());
    }
}


public class CurrentThread {
    static void main(String[] args) {
        CheckCurrenThread checkCurrenThread = new CheckCurrenThread();
        checkCurrenThread.start();
        System.out.println(checkCurrenThread.currentThread().getName());

    }
}
