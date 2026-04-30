package MultiThreading;

public class PrioritiesThread extends Thread {
    public void run(){
        System.out.println("Child Thread");
        System.out.println("Child Priority : "+Thread.currentThread().getPriority());
    }

    static void main(String[] args) {
        System.out.println("Main Old Priority : "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(MAX_PRIORITY);
        System.out.println("Main New Priority : "+Thread.currentThread().getPriority());
        PrioritiesThread pt = new PrioritiesThread();
        pt.start();
    }
}
