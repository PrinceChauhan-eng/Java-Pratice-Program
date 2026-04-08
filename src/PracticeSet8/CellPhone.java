package PracticeSet8;

class CellPhone {
    void ringing(){
        System.out.println("Phone is Ringing");
    }
    void vibrate(){
        System.out.println("Phone is Vibrating");
    }

    static void main(String[] args) {
        CellPhone c = new CellPhone();
        c.ringing();
        c.vibrate();
    }
}
