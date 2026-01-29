package phase_1_Java_fundamentals;
import java.util.Scanner;

public class SundayPracticeWeek1 {
    public static void main(String[] args) {

//        Interactive Calculator

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter operation: ");
        char operation = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        if  (operation == '+') {
            System.out.println("Result: " + (num1 + num2));
        }  else if (operation == '-') {
            System.out.println("Result: " + (num1 - num2));
        }   else if (operation == '*') {
            System.out.println("Result: " + (num1 * num2));
        } else if (operation == '/') {
                if (num2 == 0) {
                    System.out.println("Error: Division by zero");
                } else {
                    System.out.println("Result: " + (num1 / num2));
                }
            } else {
            System.out.println("Invalid operation");
        }

        scanner.close();
    }
}
