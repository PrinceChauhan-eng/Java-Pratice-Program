package Sets;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PracticeTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(8);
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(4);
        treeSet.add(2);
        System.out.println("Tree Set : " + treeSet);
        treeSet.add(3);

        //Find: first element & last element
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());


    }
}
