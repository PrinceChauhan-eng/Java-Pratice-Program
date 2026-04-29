package MultiThreading;

public class SleepDemo extends Thread{
    public void run(){
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName()+" : "+ i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    static void main(String[] args) {
        SleepDemo sd = new SleepDemo();
        Thread.currentThread().getName();
        sd.start();
//        SleepDemo sleepDemo = new SleepDemo();
//        sleepDemo.start();

    }
}
