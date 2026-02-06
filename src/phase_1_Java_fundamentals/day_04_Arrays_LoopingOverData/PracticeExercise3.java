package phase_1_Java_fundamentals.day_04_Arrays_LoopingOverData;
import java.util.Scanner;
import java.util.Random;

public class PracticeExercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();

        int[] numbers = new int[n];


        sc.close();
    }
}
