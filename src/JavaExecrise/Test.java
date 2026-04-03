package JavaExecrise;

import AccessModifiers.*;

public class Test {
    static void main() {
        ProtectedMain ps = new ProtectedMain();
        ps.netSpeed();


        ProtectedAccessModifier pm = new ProtectedMain();
//        System.out.println(pm.speed);
        pm.show();
    }
}
