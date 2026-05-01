package MultiThreading;

class MyThread extends Thread{
    public void run(){
        System.out.println(getName()+" is Running");
        for (int i = 1 ; i<=5;i++){
            System.out.println(getName()+ " Count : "+ i);
        }
        System.out.println(getName() + " Finished Execution");
    }
}

public class ThreadIsAlive {
    static void main(String[] args)throws Exception {
        MyThread myThread = new MyThread();
        myThread.setName("Thread - 1");
        System.out.println("Before Start : "+ myThread.isAlive());
        myThread.start();
        System.out.println("After Start : "+ myThread.isAlive());

        myThread.sleep(1000);

        System.out.println("After Completion :"+myThread.isAlive());
    }

}
