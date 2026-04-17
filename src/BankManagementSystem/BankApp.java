package BankManagementSystem;
import java.util.*;

public class BankApp {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Create Account
        System.out.println("Enter Account Holder Name");
        String name = sc.nextLine();
        Account account =new Account(name);
        account.setBalance(0);

        //Inject account into Service
        BankServiceImpl service = new BankServiceImpl(account);
        System.out.println("---------------Welcome Apna Sapna Bank---------------");
        System.out.println("Choose :\t1.Balance Check \n\t\t\t2.Deposit \n\t\t\t3.With Draw");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.print(account.getAccHolderName()+" your balance is : "+account.getBalance());
                break;
            case 2:
                System.out.print("Enter amount for deposit : ");
                double depamount = sc.nextDouble();
                service.deposit(depamount);
                System.out.println("Your balance is : "+account.getBalance());
                break;
            case 3:
                System.out.print("Enter amount for Withdraw : ");
                try {
                    double witamonut = sc.nextDouble();
                    service.withDraw(witamonut);
                    System.out.println("Your balance is : "+account.getBalance());
                }catch (InsuficientBalanceFoundException e){
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Enter Invalid Input");
        }
        System.out.println();
        System.out.println("Application Close");


    }



}
