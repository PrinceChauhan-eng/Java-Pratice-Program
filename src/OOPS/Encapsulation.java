package OOPS;

class Encapsulation {
    private double balance;
    private double amount;

    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        if (amount<=balance){
            balance-=amount;
        }
        else {
            System.out.println("InSufficient Balance");
        }
    }

    public double getBalance(){
        return balance;
    }

}


