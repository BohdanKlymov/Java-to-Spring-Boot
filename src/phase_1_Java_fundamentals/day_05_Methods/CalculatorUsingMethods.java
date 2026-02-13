package phase_1_Java_fundamentals.day_05_Methods;
import java.util.Scanner;

public class CalculatorUsingMethods {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char op = getUserChoice(sc);

        int[] numbers = getNumbers(sc);
        int num1 = numbers[0];
        int num2 = numbers[1];

        float result = calculate(op, num1, num2);
        printResult(result);

        sc.close();
    }


    public static char getUserChoice(Scanner sc) {

        System.out.print("Please enter the operators (+, -, *, /): ");
        char op = sc.next().charAt(0);

        return op;
    }

    public static int[] getNumbers(Scanner sc) {

        System.out.print("Please enter first number: ");
        int num1 =  sc.nextInt();

        System.out.print("Please enter second number: ");
        int num2 =  sc.nextInt();

        return new int[]{num1, num2};

    }

    public static float calculate(char op, int num1, int num2) {

        switch (op) {
            case '+': return (num1 + num2);
            case '-': return (num1 - num2);
            case '*': return (num1 * num2);
            case '/':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                    return 0;
                }
                return (float) num1 / num2;
            default:
                System.out.println("Invalid input");
                return 0;
        }
    }

    public static void printResult(float result) {
        System.out.println("The result is: " + result);
    }

}


