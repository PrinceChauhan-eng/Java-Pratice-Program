package MultiThreading;

public class JoinDemo extends Thread{
    static Thread  mainThread;
    public void run(){
         try {
             //mainThread.join();
             for (int i = 1 ; i<=5;i++){
                 System.out.println(Thread.currentThread().getName()+" _ "+i);
                 Thread.sleep(1000);
             }
         }catch (Exception e){
             System.out.println(e);
         }

    }


    static void main(String[] args) throws Exception {
        JoinDemo jd = new JoinDemo();
        mainThread = Thread.currentThread();
        jd.start();
        jd.join();
        try {
            for (int i = 1 ; i<=5;i++){
                System.out.println(Thread.currentThread().getName()+" _ "+i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println(e);
        }


    }
}
