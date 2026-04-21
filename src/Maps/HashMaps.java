package Maps;
import java.util.*;


public class HashMaps {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(101, "Prince"); // Put Method is used to insert data in HashMap
        hm.put(102, "Chauhan");
        hm.put(103, "Vnita");
        hm.put(102, "Java");

//        hm.remove(102); // Remove Method used in Key not on a Values
        //hm.remove("Prince");
        System.out.println(hm.containsKey(102)); // It Checks key is present in data and returns in Boolean values
        System.out.println(hm.get(109)); // If Key is not present in data it returns NULL value
        System.out.println(hm.containsValue("Java"));



//        Set set = hm.entrySet();
//        System.out.println(set);
//        Iterator itr = set.iterator();
//        while (itr.hasNext()){
//            //System.out.println(itr.next());
//            Map.Entry entry = (Map.Entry) itr.next();
//            System.out.println(entry.getKey()+" -> "+entry.getValue());
//    }







    }

}
