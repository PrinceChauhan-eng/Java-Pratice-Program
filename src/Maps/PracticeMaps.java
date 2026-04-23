package Maps;

import java.util.HashMap;
import java.util.Map;

public class PracticeMaps {
    public static void main(String[] args) {

        //Create a HashMap and add key-value pairs.
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Prince");
        map.put(106, "Pankaj");
        map.put(105, "Ankit");
        map.put(107, "Prince");
        map.put(109, "Vinita");
        map.put(117, "Chauhan");
        System.out.println("Map are : " + map);

        //Retrieve value using a key.
        System.out.println("Key Value : " + map.get(101));

        //Check if a key exists in the map
        System.out.println("Key Exist : " + map.containsKey(101));
        System.out.println("Key Exist : " + map.containsKey(110));

        //Check if a value exists in the map.
        System.out.println("Key Exist : " + map.containsValue("Prince"));
        System.out.println("Key Exist : " + map.containsValue("Praveen"));

        //Remove a key-value pair.
        System.out.println("Remove key value : " + map.remove(101, "Prince"));
        System.out.println("Remove key value : " + map.remove(101, "Pri"));
        System.out.println(map);

        //Get size of the map.
        System.out.println("Size of Map : "+map.size());

        //Print all keys, values, and key-value pairs.
        System.out.println("Print Key : "+map.keySet());
        System.out.println("Print Value: "+map.values());

    }
}
