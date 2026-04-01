package AccessModifiers;

public class AccessModifierMain {
    static void main() {
        PrivateAccessModifiers am=new PrivateAccessModifiers();
        am.setName("Hello");
        am.setAge(25);
        System.out.println("Name : "+am.getName() + " Age : "+am.getAge());
    }
}
