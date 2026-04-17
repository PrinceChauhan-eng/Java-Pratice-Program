package OOPS;

class Account {
    private String accountHolder;
    private int balance;

    public void setAccountHolder(String a) {
        accountHolder = a;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void deposite(double amount)
    {
        if (amount > 0)
            balance += amount;
        else
            System.out.println("Invalid amount Enter");
    }

    public void withDraw(double amount){
        if (amount<balance)
            balance-=amount;

        else
            System.out.println("Insuficient Balance in your Account");

    }

}

public class BankApp {
    public static void main(String[] args){
        Account a = new Account();
        a.setAccountHolder("Prince Chauhan");
        a.deposite(10000);
        a.withDraw(1200);
        System.out.println("Account holder name : "+a.getAccountHolder());
        System.out.println("Your Balance is : "+a.getBalance());
    }
}
