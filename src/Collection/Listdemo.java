package Collection;

import ArrayList.ArrayLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listdemo {
    public static void main(String[] args){
        List l = new ArrayList();
        l.add(100);
        l.add(200);
        l.add(200);
        l.add(300);
        l.add(400);

        l.listIterator();

        //System.out.println(l);
//        Iterator itr = l.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }



    }
}
