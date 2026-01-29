package phase_1_Java_fundamentals.day_02_if_else_switch;
import java.util.Scanner;

public class Exercise_1_NumberAnalyzer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        String numIs = "This number is ";

        if (num < 0) {
            System.out.println(numIs + "negative");
        } else if (num > 0) {
            System.out.println(numIs + "positive");
        } else  {
            System.out.println(numIs + "zero");
        }

        if (num % 2 == 0) {
            System.out.println(numIs + "even");
        } else {
            System.out.println(numIs + "odd");
        }

        scanner.close();
    }
}
