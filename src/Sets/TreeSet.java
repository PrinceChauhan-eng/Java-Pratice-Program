package Sets;

public class TreeSet {
    public static void main(String [] args){
        java.util.TreeSet ts = new java.util.TreeSet();
        ts.add(10);
        ts.add(50);
        ts.add(20);
        ts.add(30);
        ts.remove(20);
        System.out.println(ts);

//        ArrayList al = new ArrayList(ts);
//        al.add(40);
//
//        System.out.println(al);
    }
}
