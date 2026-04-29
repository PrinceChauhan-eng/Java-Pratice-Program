class MyThread1 extends Thread{
    public void run(){
        System.out.println(getName()+"is Running");
        for (int i =0;i<=5;i++){
            System.out.println(getName()+" count : "+i);
        }
        System.out.println(getName()+"Finish Execution");
    }

}

public class Main {
    static void main(String[] args) throws Exception {
        MyThread1 myThread1 = new MyThread1();
        myThread1.setName("Thread-1");
        System.out.println("Before Start : "+ myThread1.isAlive());

        myThread1.start();
        System.out.println("After Start : "+ myThread1.isAlive());

        Thread.sleep(1000);
        System.out.println("After Completion: "+ myThread1.isAlive());


    }
}