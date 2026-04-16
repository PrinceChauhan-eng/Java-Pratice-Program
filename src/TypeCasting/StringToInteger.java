package TypeCasting;

public class StringToInteger {
    static void main(String[] args) {
        String a ="123";
        int b = Integer.parseInt(a);
        System.out.println(b);

        String c="123";
        String d ="589";
        int sum = Integer.parseInt(c)+Integer.parseInt(d);
        System.out.println(sum);

        int w=123;
        int q =589;
        String sum1=String.valueOf(w)+String.valueOf(q);
        System.out.println(sum1);
    }
}
