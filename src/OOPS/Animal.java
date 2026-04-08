package OOPS;

abstract class Animal {
     public void walk(){
         System.out.println("Animal walk");
     };

     public void eat(){
         System.out.println("animal eat");
     }
}

class Horse extends Animal{
    public void talk(){
        System.out.println("Horse walk on 4 legs");
    }
}

