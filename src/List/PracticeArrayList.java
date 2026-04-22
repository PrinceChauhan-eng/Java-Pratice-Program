package List;

import java.util.*;

public class PracticeArrayList {
    static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 8, 9, 5, 5, 8, 6, 7, 6);

        //Reverse List Using For loop
        for (int i = list.size() - 1; i > 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //One to another list Copy
        List<Integer> copy = new ArrayList<>(list);
        System.out.println("Original list are : " + list);
        System.out.println("Copy list are : " + copy);

        //Count Even and Odd Number
        int even = 0;
        int odd = 0;
        for (int num : list) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even count : " + even);
        System.out.println("Odd count : " + odd);


        //Find  Duplicate and Unique Values in List
        List<Integer> unique = new ArrayList<>();
        List<Integer> duplicate = new ArrayList<>();
        for (int num : list) {
            if (!unique.contains(num)) {
                unique.add(num);
            } else {
                duplicate.add(num);

            }
        }
        System.out.println("Unique : " + unique);
        System.out.println("Duplicate : " + duplicate);


        //Sorting a List using Collection Interface
        Collections.sort(list);
        System.out.println(list);

        //Finding Maximum and Minimum Value in List
        Set<Integer> sort = new TreeSet<>(list);
        System.out.println(sort);
        int min = list.get(0);
        int max = list.get(0);
        for (int num : list) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Maximum is : " + max + "\n" + "Minimum is : " + min);

        //Create an ArrayList of Strings and print all elements.
        List<String> strings = Arrays.asList("Vinita", "Prince", "Pankaj", "Nilesh", "Ajit");
        System.out.println("Your Given String List are : " + strings);

        //Add 5 numbers to an ArrayList and print using:for loop & for-each loop
        //1. Using For Loop
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list.get(+i));
        }
        //2. Using For-each loop
//        for(int num : list1){
//            System.out.print(num);
//        }
        System.out.println();
        //Insert an element at the beginning of the list.
        List<Integer> list2 = new ArrayList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(5);
        System.out.println(list2);

        list2.addFirst(15);
        System.out.println(list2);
        list2.addLast(20);
        System.out.println(list2);
        System.out.println(list2.removeFirst());
        System.out.println(list2.removeLast());

        //Sum of List Elements
        int sum = 0;
        for (int i = 0; i < list2.size(); i++) {
            sum = sum + list2.get(i);
        }
        System.out.println("Sum of Element is : " + sum);

        //Find average of elements.
        int avg=0;
        int sum1 =0;
        List<Integer>list3=new ArrayList<>(Arrays.asList(1,5,8,6,4,2,3));
        for (int num : list3){
            sum1+=num;
        }
        avg=sum1/list3.size();
        System.out.println("Average of a List is : "+avg);

        //Find all elements greater than a given number.
        int given = 10;
        List<Integer>list4=new ArrayList<>(Arrays.asList(5,6,4,8,10,23,45,68,89,55,85,78));
        for (int num:list4){
            if (num>given){
                System.out.print(num+" ");
            }
        }
        System.out.println();

        //Count how many numbers are divisible by 3.
        int count=0;
        List<Integer>divisible=new ArrayList<>();
        List<Integer>list5=new ArrayList<>(Arrays.asList(3,6,9,18,5,4,21,30));
        for (int num:list5){
            if (num%3==0){
                divisible.add(num);
                count++;
            }
        }
        System.out.println("Divisible by 3 is : "+divisible);
        System.out.println("Count of Divisible by 3 is : "+count);



    }
}
