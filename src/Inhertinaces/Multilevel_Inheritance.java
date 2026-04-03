package Inhertinaces;

class Multilevel_Inheritance {
    Multilevel_Inheritance() {
        System.out.println("This is Vehicle");
    }
}

class FourWheeler extends Multilevel_Inheritance {
    FourWheeler() {
        System.out.println("This is Four Wheeler Vehicle");
    }
}

class Bike extends FourWheeler {
    Bike() {
        System.out.println("This is Car Vehicle");
    }
}

class Tested {
    static void main(String[] args) {
        Bike c = new Bike();
    }
}