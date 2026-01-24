package phase_1_Java_fundamentals.day_01_operators_input;
import java.util.Scanner;

public class mini_logic_challenges {
    public static void main(String[] args) {

//        Challenge 1 - Even or Odd

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();


        if (number % 2 == 0){
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }

//        Challenge 2 - Simple Grade Checker

        System.out.print("Enter a number between 0 and 100: ");
        int number1 = scanner.nextInt();

        if (number >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

//        Challenge 3 - Age Category

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 13) {
            System.out.println("Child");
        } else if (age < 20) {
            System.out.println("Teen");
        } else {
            System.out.println("Adult");
        }
    }
}
