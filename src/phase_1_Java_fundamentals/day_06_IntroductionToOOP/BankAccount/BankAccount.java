package phase_1_Java_fundamentals.day_06_IntroductionToOOP.BankAccount;

public class BankAccount {

    private String ownerName;
    private double balance;

    public BankAccount(String ownerName, int balance) {
        this.ownerName = ownerName;
        this.balance = Math.max(balance, 0);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayInfo() {
        System.out.println("User " + ownerName + " has " + balance + " on his balance.");
    }
}
