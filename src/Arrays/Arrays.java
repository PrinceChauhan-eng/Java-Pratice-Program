package Arrays;

import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        //Primitive Array
        int[] arr ={10,20,30,40,50};
        //Basic for loop to store array
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //Advance For loop to store Array
        for(int num:arr){
            System.out.println(num);
        }

        //Non - Primitive type
        String [] name ={"Prince","Praveen","Yash"};
        for (String str : name){
            System.out.println(str);

        }









//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter total Number of Element : ");
//        int size = sc.nextInt();
//        int[] num = new int[size];
//        for (int i = 1; i <= size; i++) {
//            System.out.print("Enter " + i + " Number :");
//            num[i-1] = sc.nextInt();
//        }
//        for (int i = 0; i < size; i++) {
//            System.out.println(num[i]);
//        }


//        //int [] marks = new int[10]; // Dosn't matter [] brackets come after marks or before marks
//        //int marks[] = new int[10];
//
//        //int marks[] = {120,256,568}; // we can directly set a value of array using {} brackets instead of set value on index
//
////      user input to store value in array
//        Scanner sc =new Scanner(System.in);
//        int size = sc.nextInt();
//
//        int numbers[] = new int[size];
//
////        marks[0] = 175;
////        marks[1] = 185;
////        marks[2] = 155;
////        System.out.println(marks[0]);
////        System.out.println(marks[1]);
////        System.out.println(marks[2]);
//        for (int i = 0; i < size; i++) {
//            //System.out.println(marks[i]);
//            System.out.println(numbers[i]);
    }
}
