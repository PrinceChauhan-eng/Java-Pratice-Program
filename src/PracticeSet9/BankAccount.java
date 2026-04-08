package PracticeSet9;

class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insuffcient Balance");
        }
    }

    public double getBalance() {
        return balance;
    }

}
