package Sets;

import java.util.*;

public class PracticeLinkedHashSet {
    public static void main(String[] args){
        Set <Integer>set=new LinkedHashSet<>();
        set.add(1);
        set.add(5);
        set.add(9);
        set.add(9);
        set.add(55);
        set.add(91);
        set.add(8);
        System.out.println(set);

        //Convert a list to LinkedHashSet and print elements.
        List<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        Set<Integer>set1= new LinkedHashSet<>(list);
        System.out.println("Convert list into Linkedhashset : "+set1);

        //Iterate and print elements in insertion order.
        Iterator itr = set1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
