package JavaInterface;

interface Student{
    String name ="Prince";
    int age =25;
    void display();
}

class Nineclass implements Student{
    public void display(){
        System.out.println("This is Nineth Class Boyz");

    }
}


public class Test {
    static void main(String[] args) {
        Nineclass n =new Nineclass();
        n.display();
        System.out.println(n.name);
        System.out.println(n.age);



    }
}
