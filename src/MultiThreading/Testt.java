package MultiThreading;

public class Testt implements Runnable{
    public void run(){
        System.out.println("Tread Created");
    }

    static void main(String[] args) {
        Testt t = new Testt();
        Thread th = new Thread(t);
        th.start();


    }
}
