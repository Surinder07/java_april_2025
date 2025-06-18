package june17.bank;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank(1000);
        System.out.println("Opening Balance of account : "+bank.getBalance());

        double balanceAfterDeposit = bank.deposit(499);
        System.out.println("Balance after 499 deposit : " + balanceAfterDeposit);

        double balanceAfterDWithdraw = bank.withdraw(200);
        System.out.println("Balance after 200 withdraw : "+balanceAfterDWithdraw);

        try {
            double balanceAfterDWithdraw1999 = bank.withdraw(1999);

            System.out.println("Balance after 1999 withdraw : " + balanceAfterDWithdraw1999);
        }
        catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("last line");

    }

}
