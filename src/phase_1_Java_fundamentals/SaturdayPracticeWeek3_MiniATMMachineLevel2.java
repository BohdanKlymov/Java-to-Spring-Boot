package phase_1_Java_fundamentals;
import java.util.Scanner;

public class SaturdayPracticeWeek3_MiniATMMachineLevel2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!login(sc)) {
            System.out.println("You failed to register.");
        } else {

            System.out.println("You are in!");

            int balance = 3000;
            boolean stop = false;

            while (!stop) {

                showMenu();

                System.out.print("Make your choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Balance: " + balance);
                        break;

                    case 2:
                        System.out.print("Enter deposit amount: ");
                        int deposit = sc.nextInt();

                        if (deposit > 0) {
                            balance += deposit;
                            System.out.println("Successfully added.");
                        } else {
                            System.out.println("Invalid deposit amount.");
                        }

                        System.out.println("Successfully added.");
                        break;

                    case 3:
                        System.out.print("Enter withdraw amount: ");
                        int withdraw = sc.nextInt();
                        if (withdraw > 0 && withdraw <= balance) {
                            balance -= withdraw;
                            System.out.println("Withdraw successful.");
                        } else {
                            System.out.println("Not enough money.");
                        }
                        break;

                    case 4:
                        System.out.println("See you again 👋.");
                        stop = true;
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }
        sc.close();
    }

    public static boolean login(Scanner sc) {

        boolean PIN = false;

        for (int i = 3; i > 0 ; i--) {
            System.out.println("You have " + i + " attempts.");

            System.out.print("Please print a PIN: ");
            int inputPIN = sc.nextInt();

            if (inputPIN == 1234) {
                PIN = true;
                break;
            } else {
                System.out.println("A wrong PIN.");
            }
        }
        return PIN;
    }

    public static void showMenu() {
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

    }
}