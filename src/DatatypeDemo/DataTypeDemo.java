package DatatypeDemo;

public class DataTypeDemo {
    public static void main(String[] args) {
        // -----------------Primitive Data type-------------------------
        byte b = 100;  // 1 bytes
        short s = 15200; // 2 bytes
        int x = 1000000000; // 4 bytes
        long l = 451541845151818L; // 8 bytes
        double d = 18151518420198151981.8851191D;  // 8 bytes
        float f = 1025.22455555558F; // 4 bytes
        char ch = 'A'; // 2 bytes
        boolean flag = true;

        //-----------------Non - Primitive Data type-----------------------
        String name = "Hello world";
        int[] arr = {1, 2, 3, 4, 5};
        Integer Wrapint = Integer.valueOf(50);
        StringBuilder sb = new StringBuilder("Java");

        //------------------OUTPUT---------------------------------------------
        System.out.println("byte"+b);
        System.out.println("short"+s);
        System.out.println("long"+l);
        System.out.println("double"+d);
        System.out.println("int"+x);
        System.out.println("boolen"+flag);
        System.out.println("Float"+f);
        System.out.println("Char"+ch);
        System.out.println("String"+name);
        System.out.println("Array");
        for (int num : arr){
            System.out.println(num + " ");
        }
        System.out.println();
        System.out.println("Wrapper class"+Wrapint);
        System.out.println("String Builder"+sb);
    }


}
