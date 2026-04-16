package AccessModifiers;

import java.util.SortedMap;

public class ProtectedAccessModifier {
    protected int speed;

    public void show(){
        speed =100;
        System.out.println("Hello java" + speed);
    }
}
