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

        //Check Palindrome
        if (name.contains(rev)){
            System.out.println("Given String is Palindrome");
        }
        else {
            System.out.println("Given String is not Palindrome");
        }

        String n = "Prince";
        String reverse =" ";
        for (int i = n.length()-1;i>=0;i--){
            reverse = reverse+n.charAt(i);
        }
        System.out.println(reverse);

        //Integer convert into String then Reverse a Number
        int num = 12345;
        String a = String.valueOf(num);
        String b = a;
        String result =" ";
        for (int i = b.length()-1;i>=0;i--){
            result = result + b.charAt(i);
        }
        System.out.println(result);

        //Without convert integer reverse number
        int number =654321;
        int reverse1 = 0;
        while (number!=0){
            int temp = number%10;
            reverse1 = reverse1*10 +temp;
            number=number/10;
        }
        System.out.println(reverse1);

        int num1 =456;
        int sum=0;
        for (int i =0;i<=num1;i++){

        }



    }


}
