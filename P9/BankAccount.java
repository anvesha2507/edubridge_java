package P9;
class BankAccount {

    private String accountNumber;
    private double balance;

    static int accountCount = 0;

    final int accountId;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        accountCount++;
        accountId = accountCount;
    }

    void deposit(double amount) {
        if (amount > 0)
            balance += amount;
        else
            System.out.println("Invalid deposit");
    }

    void withdraw(double amount) {
        if (amount <= 0)
            System.out.println("Invalid withdrawal");
        else if (amount > balance)
            System.out.println("Insufficient balance");
        else
            balance -= amount;
    }

    double getBalance() {
        return balance;
    }
}

class BankTest {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("ACC1001", 5000);

        System.out.println("Initial balance: " + account.getBalance());

        account.deposit(2000);
        System.out.println("After deposit: " + account.getBalance());

        account.withdraw(1500);
        System.out.println("After withdrawal: " + account.getBalance());

        account.withdraw(10000);

        System.out.println("Accounts created: " + BankAccount.accountCount);
    }
}