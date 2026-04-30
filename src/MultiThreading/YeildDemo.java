package MultiThreading;

public class YeildDemo extends Thread{
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" _ "+i);
        }
    }

    static void main(String[] args) {
        YeildDemo yd = new YeildDemo();
        yd.start();

        Thread.yield();
        for (int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" _ "+i);
        }
    }
}
