package Maps;
import java.util.*;

public class TreeMaps {
    public static void main(String[] args){
        TreeMap tm = new TreeMap();
        tm.put(101,"AAA");
        tm.put(109,"AAA");
        tm.put(105,"AAA");
        tm.put(107,"AAA");
        tm.put(102,"BBB");
        tm.put(103,"CCC");

        System.out.println(tm);
        System.out.println(tm.ceilingEntry(106)); //Ceiling Entry checks equal and greater key value and return in Key Value pairs
        System.out.println(tm.floorEntry(106)); //Ceiling Entry checks equal and Lowest key value and return in Key Value pairs
        System.out.println(tm.firstEntry()); // Return First Entry in HashMap
        System.out.println(tm.get(101)); // Retrieve Values only not Key
        System.out.println(tm.headMap(102));
        System.out.println(tm);
        System.out.println(tm.higherEntry(104));




    }
}
