package Synchronization;

class TotalEarning extends Thread {
    int totalEarn = 0;
    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                totalEarn = totalEarn + 100;
            }
            this.notify();
        }
    }
}


public class InterThread {
    static void main(String[] args) throws InterruptedException{
        TotalEarning te = new TotalEarning();
        te.start();
        synchronized (te){
            te.wait();
            System.out.println("Total Earning : "+te.totalEarn);
        }
    }
}
