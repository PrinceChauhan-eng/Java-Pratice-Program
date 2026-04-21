package Maps;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args){
        Map m = new HashMap();
        m.put(1,"Prince");
        m.put(2,"Ajit");
        m.put(3,"Pankaj");
        System.out.println(m);
        System.out.println(m.containsKey(3));
        System.out.println(m.containsValue("Prince"));
        System.out.println(m.get(2));
        System.out.println(m.remove(3));
        System.out.println(m);
        m.replace(2,"Vinita");
        System.out.println(m);
        System.out.println(m.size());

    }
}
