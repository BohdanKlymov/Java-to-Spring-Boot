package phase_1_Java_fundamentals.day_04_Arrays_LoopingOverData;
import java.util.Scanner;
import java.util.Random;

public class PracticeExercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter the number of integers in the array: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.print("Numbers in array: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(101);

            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        int sum = 0;

        for (int j = 0; j < numbers.length; j++) {
            sum += numbers[j];
        }

        System.out.println("Sum of all numbers: " + sum);

        int max = numbers[0];

        for  (n = 1; n < numbers.length; n++) {
            if (numbers[n] > max) {
                max = numbers[n];
            }
        }

        System.out.println("Max number: " + max);


        sc.close();
    }
}
