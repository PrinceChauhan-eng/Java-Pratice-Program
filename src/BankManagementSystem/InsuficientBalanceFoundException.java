package BankManagementSystem;

public class InsuficientBalanceFoundException extends Exception{
    InsuficientBalanceFoundException(String msg){
        super(msg);
    }
}
