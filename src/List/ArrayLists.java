package List;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(5,900); // adding at specific index
        System.out.println(list);

        list.remove(4); // remove with Index
        list.remove(Integer.valueOf(200)); // remove with Value
        list.set(4,800); // Updating a List
        System.out.println(list.size()); // Getting the Size of a List
        System.out.println(list.contains(100)); //Checking Specific Element present or not
        System.out.println(list);

        ArrayList al2 = new ArrayList();
        al2.add("aaa");
        al2.add("bbb");
        al2.add("ccc");
        al2.add("ddd");
        al2.add(100);
        al2.add(300);

        list.addAll(al2);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.remove(al2);

        list.set(2, "Prince");

        System.out.println(list.get(5));
        System.out.println(list.indexOf("Prince"));
        System.out.println(list.size());
        System.out.println(list.contains("Prince"));



    }
}
