package QuestionSolving;

class Parent {
    protected int speed = 100;
}
class   Child extends Parent{
    void show(){
        System.out.println(speed);
    }

    static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
