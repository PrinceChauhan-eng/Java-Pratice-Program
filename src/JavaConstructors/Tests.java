package JavaConstructors;

public class Tests {
    String name;
    Tests(){
        System.out.println("This is Default");
    }
    Tests(String n){
        name = n;
        System.out.println("Here name is : "+name);
    }
    Tests(long id){
        System.out.println("Here id is : "+id);
    }

    static void main(String[] args) {
        Tests t = new Tests();
        Tests d = new Tests("Prince");
        Tests a = new Tests(10);
    }
}
