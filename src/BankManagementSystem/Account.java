package BankManagementSystem;

public class Account {
    private  String accHolderName;
    private double balance;


    public Account(String accHolderName){
        this.accHolderName=accHolderName;

    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
       this.balance=balance;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public String getAccHolderName(){
        return accHolderName;
    }
}
