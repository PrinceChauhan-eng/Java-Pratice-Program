package BankManagementSystem;

public interface BankService {

    public double deposit(double amount);
    public void withDraw(double amount) throws InsuficientBalanceFoundException;

}

