package Sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PracticeSets {
    static void main(String[] args) {
        //🟢 SET — BASIC QUESTIONS
        //Create a Set and add elements. Print them.
        Set<Integer>set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        System.out.println(set);

        //Try adding duplicate elements—what happens?
        set.add(40);
        System.out.println(set);// Set not added a duplicate value

        //Check if a set contains a specific element.
        System.out.println("Check if a set contains a specific element : "+set.contains(10));

        //Remove an element from a set.
        set.remove(40);
        System.out.println("Remove an element from a set : "+set);

        //Find size of the set.
        System.out.println("Size of the set : "+set.size());

        //Check if the set is empty.
        System.out.println("Set is empty : "+set.isEmpty());

        //Iterate over a set using: for-each & iterator
        for (int num:set){
            System.out.print(num+" ");
        }

        Iterator itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }



    }
}
