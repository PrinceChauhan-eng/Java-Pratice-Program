package BankManagementSystem;

public class BankServiceImpl implements BankService {
    private Account account;

    public BankServiceImpl(Account account) {
        this.account = account;
    }

    @Override
    public double deposit(double amount) {
        if (amount > 0) {
            account.setBalance(account.getBalance() + amount);
        }
        return amount;
    }

    @Override
    public void withDraw(double amount) throws InsuficientBalanceFoundException {
        if (amount <= account.getBalance()) {
            account.setBalance(account.getBalance() - amount);
        } else {
            throw new InsuficientBalanceFoundException("Insufficient Balance");
        }
    }
}
