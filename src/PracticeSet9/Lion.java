package PracticeSet9;

//Overriding Method
class Lion {
    void sound(){
        System.out.println("Roar");
    }
}

class Club extends Lion{
    void sound(){
        System.out.println("club roar");
    }

    static void main(String[] args) {
        Club c = new Club();
        c.sound();
    }
}
