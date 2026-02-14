package phase_1_Java_fundamentals;
import java.util.Random;
import java.util.Scanner;

public class SaturdayPracticeWeek2_NumberGuessingGameLevel2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secretNum = generateRandomNumber();

        boolean won = playGame(secretNum, sc);

        printResult(won, secretNum);

        sc.close();
    }

    public static int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100) + 1;
    }

    public static boolean playGame(int secretNum, Scanner sc) {

        for (int i = 7; i > 0; i--) {
            System.out.println("your attempts: " + i);

            System.out.print("Enter a number between 1 and 100: ");
            int num = sc.nextInt();

            if (num < 1 || num > 100) {
                System.out.println("Please enter number between 1 and 100.");
                i++;
                continue;
            } else if (secretNum > num) {
                System.out.println("Secret number is bigger");
            } else if (secretNum < num) {
                System.out.println("Secret number is smaller");
            } else {
                return true;
            }
        }
        return false;
    }

    public static void printResult(boolean won, int secretNum) {
        if (won) {
            System.out.println("You guessed the secret number: " + secretNum);
        } else {
            System.out.println("You lost. The secret number was: " + secretNum);
        }
    }
}
