package ControlStatement;

public class JumpStatement {
    public static void main(String[] args){
        //Break Statement
        for (int i =1;i<=10;i++){
            if (i==5){
                System.out.println("Loop Stop at : "+i);
                break;
            }
            System.out.println(i);
        }

        //Continue Statement
        for (int i = 1;i<=5;i++){
            if (i ==3){
                System.out.println("Skipping at :  "+i);
                continue;
            }
            System.out.println(i);
        }


    }
}
