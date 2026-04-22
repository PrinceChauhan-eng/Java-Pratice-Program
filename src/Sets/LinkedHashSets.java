package Sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSets {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(80);
        set.add(140);
        System.out.println(set);



    }
}
