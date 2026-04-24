package List;

import java.util.*;

public class PracticeLinkedList {
    public static void main(String[] args){

        //LINKED LIST — BASIC QUESTIONS

        //Create a LinkedList and add elements.
        List<Integer>list=new LinkedList<>();
        list.add(80);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(40);
        list.add(50);
        System.out.println("Added to List : "+list);

        //Add element at: first & Last
        list.addFirst(1);
        list.addLast(60);
        System.out.println(list);

        //Remove first element.
        list.removeFirst();
        System.out.println("Remove First Element "+list);

        //Remove Last element.
        list.removeLast();
        System.out.println("Remove Last Element "+list);

        //Get first element.
        System.out.println("Getting First Element "+list.getFirst());

        //Get Last element.
        System.out.println("Getting last Element "+list.getLast());

        //Check if list contains an element.
        System.out.println("List contains an Element : "+list.contains(10));

        //Find size of LinkedList.
        System.out.println("Size of a LinkedList is : "+list.size());

        //Clear the LinkedList.
//        list.clear();
//        System.out.println("Cleared list : "+list);

        //Iterate using iterator.
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next());
        }

        //LINKED LIST — INTERMEDIATE QUESTIONS
        System.out.println();
        //Reverse a LinkedList.
//        List<Integer>reverse = new LinkedList<>(); // Using For loop for reverse
//        for (int i =list.size()-1;i>=0;i--){
//            reverse.add(list.get(i));
//        }
//        System.out.println("Reverse LinkedList : "+reverse);

        System.out.println("Reverse LinkedList : "+list.reversed());// Using Method for Reverse

        //Find middle element of LinkedList.
        int middle =list.size()/2;
        System.out.println("Middle element of LinkedList : "+list.get(middle));

        //Convert LinkedList → ArrayList.
        List<Integer>list1=new ArrayList<>(list);
        System.out.println(list1);

        //Convert ArrayList → LinkedList.
        List<Integer> list2= new LinkedList(list1);
        System.out.println(list2);

        //Add element at a specific index
        list.add(2,60);
        System.out.println("Add element at a specific index : "+list);

        //Remove element at a specific index.
        list.remove(2);
        System.out.println("Remove element at a specific index : "+list);

        //Count number of elements greater than X.
        int x =10;
        int count=0;
        for (int num:list){
            if (num>x){
                count++;
            }
        }
        System.out.println("Count number of elements greater than X : "+count);

        //Sort LinkedList.
        Collections.sort(list);
        System.out.println("Sort LinkedList : "+list);

        //Merge two LinkedLists.
        List<Integer>list3=new LinkedList<>(Arrays.asList(10,20,3,4,5,6,7));
        list3.addAll(list);
        System.out.println("Merge two LinkedLists : "+list3);

        //Remove duplicates from LinkedList.
        Set<Integer>set=new HashSet<>(list3);
        System.out.println("Remove duplicates from LinkedList : "+set);











    }
}
