package Synchronization;

class BookTheaterApp{
    static int total_Seats = 20;
    static synchronized void bookSeats(int seats){
        if (total_Seats>=seats){
            System.out.println(seats+" tickets book Successfully");
            total_Seats=total_Seats-seats;
            System.out.println((total_Seats+" tickets are remaining"));
        }
        else {
            System.out.println(("You are trying to book "+seats+" but "+total_Seats+" tickets are remaining"));
            System.out.println("Sorry you can not book Seats !!!");
        }
    }
}


class MyThread extends Thread{
    BookTheaterApp bta;
    int seats;
    public MyThread(BookTheaterApp bta , int seats){
        this.bta=bta;
        this.seats=seats;
    }
    public void run(){
        bta.bookSeats(seats);
    }
}

class MyThread1 extends Thread{
    BookTheaterApp bta;
    int seats;
    public MyThread1(BookTheaterApp bta , int seats){
        this.bta=bta;
        this.seats=seats;
    }
    public void run(){
        bta.bookSeats(seats);
    }
}



public class StaticSynchronized {
    static void main(String[] args) {
        BookTheaterApp bookTheaterApp = new BookTheaterApp();
        MyThread t = new MyThread(bookTheaterApp,11);
        t.start();
        MyThread1 t1 = new MyThread1(bookTheaterApp,11);
        t1.start();

        BookTheaterApp bookTheaterApp1 = new BookTheaterApp();
        MyThread t2 = new MyThread(bookTheaterApp1,7);
        t2.start();
        MyThread1 t3 = new MyThread1(bookTheaterApp1,2);
        t3.start();
    }
}
