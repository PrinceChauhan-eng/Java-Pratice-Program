package Methods;

abstract class Abstarcts{
    abstract void name1(String name);
    String name2;
    void name2(){
        System.out.println(this.name2);
    }
}
class Methods1 extends Abstarcts{
    @Override
    void name1(String name1){
        System.out.println(name1);
    }
    public static void main(String[] args){
        Methods1 abs = new Methods1();
        abs.name1("Hello");
        System.out.println("Name : "+abs);
    }
}
