public class TransactionAccount extends BankAccount {
    private final double overDraftLimit = 500;

    public TransactionAccount(String accountNumber, String accountHolderName, double Balance) {
        super(accountNumber, accountHolderName, Balance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("برای این حساب هیچ interest وجود ندارد.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overDraftLimit) {
            balance -= amount;
            System.out.println("مبلغ " + amount + " از حساب شماره " + getAccountNumber() + " برداشت شد.");
        } else {
            System.out.println("مبلغ نادرست است یا بیش از حد برداشت می‌شود.");
        }
    }
}