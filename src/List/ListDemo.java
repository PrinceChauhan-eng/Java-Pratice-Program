package List;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args){
        List l = new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);

        ArrayList al = new ArrayList();
        al.add(50);
        al.add(60);
        al.add(70);
        al.addAll(l);
        System.out.println(al);

    }
}
