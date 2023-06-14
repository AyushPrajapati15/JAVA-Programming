class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Current balance: $" + balance);
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: $" + balance);
        } else {
            System.out.println("Insufficient funds. Current balance: $" + balance);
        }
    }
    }
    public class O2_bankBal {
        public static void main(String[] args) {
            BankAccount account = new BankAccount("123456789", "John Doe", 1000.0);
            account.deposit(500.0);
            account.withdraw(200.0);
        }
    }
