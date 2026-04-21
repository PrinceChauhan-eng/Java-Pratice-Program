package Collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class ItrDemo{
    public static void main(String[] args)
    {
        List l = new ArrayList();
        l.add(100);
        l.add("Prince");
        l.add("Chauhan");

        Iterator itr = l.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}

class ListItr {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(10);
        l.add("King");
        l.add("Badshah");


        ListIterator itr = l.listIterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
        itr.next();
        itr.next();
        itr.next();


        System.out.println("---------------------------------------");

        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
        itr.set(200);
        System.out.println(l);

    }
}
