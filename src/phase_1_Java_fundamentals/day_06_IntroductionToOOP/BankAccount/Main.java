package phase_1_Java_fundamentals.day_06_IntroductionToOOP.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount oleg = new BankAccount("Oleg Müller", 7024);
        BankAccount alex = new BankAccount("Alexandr Herrmann", 12500);

        oleg.deposit(300);
        alex.withdraw(8000);

        oleg.displayInfo();
        alex.displayInfo();
    }
}
