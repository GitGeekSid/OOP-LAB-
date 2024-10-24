import java.util.Scanner;

// Base Account class
class Account {
    String customerName;
    int accountNumber;
    String accountType;
    double balance;

    // Constructor to initialize account details
    public Account(String customerName, int accountNumber, String accountType, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Balance: $" + balance);
    }

    // Method to accept deposit and update balance
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount);
    }

    // Method to withdraw and update balance (to be overridden in derived classes)
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

// Derived class for Current Account
class CurrentAccount extends Account {
    private final double MIN_BALANCE = 1000.0;
    private final double SERVICE_TAX = 50.0;

    public CurrentAccount(String customerName, int accountNumber, double balance) {
        super(customerName, accountNumber, "Current Account", balance);
    }

    // Overriding the withdraw method to impose service tax if balance falls below the minimum
    @Override
    public void withdraw(double amount) {
        if (balance - amount < MIN_BALANCE) {
            System.out.println("Cannot withdraw. Minimum balance requirement not met.");
        } else {
            super.withdraw(amount);
            checkMinimumBalance();
        }
    }

    // Check if balance is below the minimum and impose service tax
    public void checkMinimumBalance() {
        if (balance < MIN_BALANCE) {
            balance -= SERVICE_TAX;
            System.out.println("Service tax imposed: $" + SERVICE_TAX);
        }
    }
}

// Derived class for Savings Account
class SavingsAccount extends Account {
    private final double INTEREST_RATE = 0.04;

    public SavingsAccount(String customerName, int accountNumber, double balance) {
        super(customerName, accountNumber, "Savings Account", balance);
    }

    // Method to compute and deposit interest
    public void computeInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println("Interest of $" + interest + " added.");
    }

    // Overriding withdraw method without minimum balance requirement
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
    }
}

// Main class
public class prog1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Current Account
        CurrentAccount currentAcc = new CurrentAccount("John Doe", 12345, 1500.0);

        // Create a Savings Account
        SavingsAccount savingsAcc = new SavingsAccount("Jane Smith", 54321, 5000.0);

        // Operations on Current Account
        System.out.println("Current Account:");
        currentAcc.displayBalance();
        System.out.println("Depositing $500 into current account...");
        currentAcc.deposit(500);
        currentAcc.displayBalance();

        System.out.println("Withdrawing $800 from current account...");
        currentAcc.withdraw(800);
        currentAcc.displayBalance();

        // Operations on Savings Account
        System.out.println("\nSavings Account:");
        savingsAcc.displayBalance();
        System.out.println("Depositing $1000 into savings account...");
        savingsAcc.deposit(1000);
        savingsAcc.displayBalance();

        System.out.println("Computing interest for savings account...");
        savingsAcc.computeInterest();
        savingsAcc.displayBalance();

        System.out.println("Withdrawing $300 from savings account...");
        savingsAcc.withdraw(300);
        savingsAcc.displayBalance();

        scanner.close();
    }
}
