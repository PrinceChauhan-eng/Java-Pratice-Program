package Strings;

public class StringBuilders {

    static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        sb.setCharAt(0,'j');
        System.out.println(sb);

        sb.append(" Java");
        System.out.println(sb);

        sb.insert(0,'p');
        System.out.println(sb);

        sb.delete(0,1);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        String name = "MOM";
        String rev = "";
        for (int i= name.length()-1; i >=0;i--){
            rev +=name.charAt(i);
        }
        System.out.println(rev);
        if (name.contains(rev)){
            System.out.println("Given String is Palindrome");
        }
        else {
            System.out.println("Given String is not Palindrome");
        }

    }


}
