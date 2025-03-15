public class Main {
    public static void main(String[] args) {
        BankCustomers bank = new BankCustomers();


        SavingAccount savingAccount1 = new SavingAccount("Sa11", "Elahe Nejatollahi", 4000);
        SavingAccount savingAccount2 = new SavingAccount("Sa22", "Mostafa Nejatollahi", 2000);
        SavingAccount savingAccount3 = new SavingAccount("Sa33", "Mojtaba Nejatollahi", 3000);

        TransactionAccount transactionAccount1 = new TransactionAccount("Ta11", "Hamid Nejatollahi", 1500);
        TransactionAccount transactionAccount2 = new TransactionAccount("Ta22", "Majid Nejatollahi", 2500);
        TransactionAccount transactionAccount3 = new TransactionAccount("Ta33", "Malika razavi", 3500);


        bank.addAccount(savingAccount1);
        bank.addAccount(savingAccount2);
        bank.addAccount(savingAccount3);
        bank.addAccount(transactionAccount1);
        bank.addAccount(transactionAccount2);
        bank.addAccount(transactionAccount3);


        bank.findAccount("Sa11");
        bank.findAccount("Sa99");


        System.out.println("موجودی حساب Sa11: " + savingAccount1.getBalance());

        savingAccount1.deposit(500);
        System.out.println("موجودی حساب Sa11: " + savingAccount1.getBalance());

        savingAccount1.deposit(-100);

        savingAccount1.calculateInterest();
        transactionAccount1.calculateInterest();

        savingAccount1.withdraw(200);
        savingAccount1.withdraw(-50);
        savingAccount1.withdraw(2000);

        transactionAccount1.withdraw(1000);
        transactionAccount1.withdraw(-50);
        transactionAccount1.withdraw(3000);

        bank.showAllBalances();
    }
}