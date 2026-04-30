package Synchronization;

class BookTicket {
    int totalSeats = 10;

    synchronized public void bookSeats(int no_seats) {
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
}

public class MovingBookingApp extends Thread {
    static BookTicket1 b;
    int seats;

    public void run() {
        b.bookSeats(seats);
    }

    static void main(String[] args){
        b = new BookTicket1();
        MovingBookingApp prince = new MovingBookingApp();
        prince.seats = 4;
        prince.setName("Prince");
        prince.start();

        MovingBookingApp pankaj = new MovingBookingApp();
        pankaj.seats=7;
        pankaj.setName("Pankaj");
        pankaj.start();


    }
}
