package Abstract;

abstract class Cars {
    abstract void engine();

    void fule() {
        System.out.println("Fule is Full");
    }
}

class Sedan extends Cars {
    void engine() {
        System.out.println("Engine Start");
    }

    static void main(String[] args) {
        Sedan s = new Sedan();
        s.engine();
        s.fule();
    }
}
