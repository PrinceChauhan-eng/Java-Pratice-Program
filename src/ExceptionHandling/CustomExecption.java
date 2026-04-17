package ExceptionHandling;

import java.util.*;

class InsuficientBalanceFound extends RuntimeException {
    InsuficientBalanceFound(String msg) {
        super(msg);
    }
}

class Account {
    private double balance;

    double getBalance() {
        return balance;
    }

    Account(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    public void withDraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
        } else {
            throw new InsuficientBalanceFound("Insuficient Balance");
        }
    }



}


public class CustomExecption {
    static void main(String[] args) {
        Account a = new Account(50000);
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------Welcome to Optimus Bank-----------------");
        System.out.println("Choose 1.Deposit 2.WithDraw 3.Check Balance)");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                System.out.print("Enter Amount to Deposit :");
                int depamount = sc.nextInt();
                a.deposit(depamount);
                System.out.println("Your Balance is : " + a.getBalance());
                break;

            case 2:
                System.out.println("Enter Amount to WithDraw");
                int witamount = sc.nextInt();
                try {
                    a.withDraw(witamount);
                } catch (InsuficientBalanceFound e) {
                    System.out.println(e.getMessage());
                } finally {
                    System.out.println("Your Balance is : " + a.getBalance());
                    sc.close();
                }
            case 3:
                System.out.println("Your Balance is : " + a.getBalance());
                break;
            default:
                System.out.println("Enter Invalid Number");
        }
        System.out.println("Application Close");

    }
}
