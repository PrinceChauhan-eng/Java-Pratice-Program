package Sets;

import java.util.ArrayList;

public class HashSet {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);


        java.util.HashSet hs = new java.util.HashSet();
        hs.addAll(al);
        hs.add(10);
        hs.add("Prince");
        hs.add("Chauhan");
        hs.add(152.2);
        System.out.println(hs);

//        Iterator itr = hs.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }

    }
}
