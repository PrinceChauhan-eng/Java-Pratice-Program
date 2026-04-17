package ControlStatement;

public class ConditionalStatement {
    public static void main(String[] args) {
        //If Statement
        int num =5;
        if (num>0) {
            System.out.println("This is a Positive Number");
        }

        //If Else Statement

        int num1 = 10;
        if (num1>num){
            System.out.println("Num1 is Greater");
        }
        else {
            System.out.println("Num2 is Greater");
        }

        //If Else If Statement
        int num2 =69;
        if (num2 >=90) {
            System.out.println("A+ grade");
        }
        else if (num2>=80){
            System.out.println("A grade");
            }
        else if (num2 >=70) {
            System.out.println("B grade");
        }
        else {
            System.out.println("Average");
        }


        //Switch Statement

        int day = 3;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Invalid Number");
        }

    }

}


