package Inhertinaces;

class Hierarchical_Inheritance {
    Hierarchical_Inheritance(){
        System.out.println("This is Vehicle");
    }
}

class Auto extends Hierarchical_Inheritance{
    Auto(){
        System.out.println("The Vehicle of Auto");
    }
}

class Bus extends Hierarchical_Inheritance{
    Bus(){
        System.out.println("The Vehicle of Buss");
    }
}

class Driver{
    static void main(String[] args) {
        Auto a = new Auto();
        Bus b = new Bus();
    }
}