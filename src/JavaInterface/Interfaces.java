package JavaInterface;

interface TestInterface {
    final int a = 10;

    void display(); // By Default it's a Public Absract Method

    default void show(){
        System.out.println("This is Default Method");
    }

    static void print(){
        System.out.println("This is Static  Method");
    }
}

