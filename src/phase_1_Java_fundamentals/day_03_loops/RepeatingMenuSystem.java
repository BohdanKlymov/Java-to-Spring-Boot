package phase_1_Java_fundamentals.day_03_loops;

import java.util.Scanner;

public class RepeatingMenuSystem {
    public  static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int balance = 3000;
        boolean stopPoint = false;

        while (stopPoint != true) {

            System.out.println("1. Check balance\n2. Deposit\n3. Withdraw\n4. Exit");
            System.out.print("Enter your choice: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.println(balance +"$");
                    break;
                case "2":
                    System.out.println("Deposit feature not implemented yet");
                    break;
                case "3":
                    System.out.println("How much do you want to withdraw?");
                    int withdraw = Integer.parseInt(sc.nextLine());

                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful.\nNow you have " + balance + "$ on your balance.");
                    } else {
                        System.out.println("Insufficient funds.");
                    }
                    break;
                case "4":
                    System.out.println("Goodbye!");
                    stopPoint = true;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

    }

}
