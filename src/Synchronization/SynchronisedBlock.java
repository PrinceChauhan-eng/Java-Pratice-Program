package Synchronization;

class BookTicket1 {
    int totalSeats = 10;

    void bookSeats(int no_seats) {
        System.out.println("Hi : "+Thread.currentThread().getName());
        System.out.println("Hi : "+Thread.currentThread().getName());
        System.out.println("Hi : "+Thread.currentThread().getName());
        System.out.println("Hi : "+Thread.currentThread().getName());
        System.out.println("Hi : "+Thread.currentThread().getName());

        synchronized (this){
            if (no_seats <= totalSeats){
                System.out.println(Thread.currentThread().getName()+" you have book " + no_seats + " Successfully");
                totalSeats = totalSeats - no_seats;
                System.out.println("Tickets is left : " + totalSeats);
            } else {
                System.out.println("You are trying to book "+no_seats+" tickets");
                System.out.println(totalSeats + " tickets are remaining");
                System.out.println("Cannot book ticket!");
            }
        }

        System.out.println("Hi : "+Thread.currentThread().getName());
        System.out.println("Hi : "+Thread.currentThread().getName());
        System.out.println("Hi : "+Thread.currentThread().getName());
        System.out.println("Hi : "+Thread.currentThread().getName());
        System.out.println("Hi : "+Thread.currentThread().getName());
    }
}

public class SynchronisedBlock extends Thread{
    static BookTicket1 b;
    int seats;

    public void run() {
        b.bookSeats(seats);
    }

    static void main(String[] args){
        b = new BookTicket1();
        SynchronisedBlock prince = new SynchronisedBlock();
        prince.seats = 4;
        prince.setName("Prince");
        prince.start();


        SynchronisedBlock pankaj = new SynchronisedBlock();
        pankaj.seats=7;
        pankaj.setName("Pankaj");
        pankaj.start();


    }
}
