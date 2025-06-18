package june17.bank;

public class Bank {
    private double withdraw;
    private double balance;
    private double deposit;


    public Bank(double balance) {
        this.balance = balance;
    }

    // check available balance
    public double getBalance(){
        return balance;
    }

    // deposit
    public double deposit(double deposit){
        balance = balance + deposit;
        return balance;
    }

    // withdraw
    public double withdraw(double withdraw){
        if(balance < withdraw){
            throw new InsufficientBalanceException("Insufficient Balance ");
        }
        balance = balance - withdraw;
        return balance;

    }








}
