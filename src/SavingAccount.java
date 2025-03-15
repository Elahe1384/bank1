public class SavingAccount extends BankAccount {
    private final double interestRate = 0.03;

    public SavingAccount(String accountNumber, String accountHolderName, double Balance) {
        super(accountNumber, accountHolderName, Balance);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate;
        deposit(interest);
        System.out.println("سود حساب به مبلغ " + interest + " به حساب اضافه شد.");
    }
}