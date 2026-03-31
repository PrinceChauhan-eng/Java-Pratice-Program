package Arrays;

import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        //int [] marks = new int[10]; // Dosn't matter [] brackets come after marks or before marks
        //int marks[] = new int[10];

        //int marks[] = {120,256,568}; // we can directly set a value of array using {} brackets instead of set value on index

//      user input to store value in array
        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];

//        marks[0] = 175;
//        marks[1] = 185;
//        marks[2] = 155;
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
        for (int i = 0; i < size; i++) {
            //System.out.println(marks[i]);
            System.out.println(numbers[i]);
        }
    }
}
