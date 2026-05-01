package AnonymousClass;

import java.util.logging.SocketHandler;

@FunctionalInterface
interface Demo {
    void meth();
//    default void meth2(){
//        System.out.println("This is Method 2");
//    };
//    static void meth3(){
//        System.out.println("This is Method 3");
//    }
//    private void meth4(){
//        System.out.println("This is method 4");
//    }
//}


    public class AnonDemo {
        static void main(String[] args) {
//            Demo obj = new Demo() {
//                @Override
//                public void meth() {
//                    System.out.println("This is Method 1");
//                }
//            };
//            obj.meth();
            Demo obj = ()->{System.out.println("This is");};
            obj.meth();
        }
    }
}

