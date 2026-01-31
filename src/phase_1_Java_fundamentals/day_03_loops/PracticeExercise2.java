package phase_1_Java_fundamentals.day_03_loops;
import java.util.Scanner;

public class PracticeExercise2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if  (num >= 1) {
            while (true) {
                for (num = num; num >= 1; num--) {
                    System.out.print(num + " ");
                }
                break;
            }
        } else {
            System.out.println("Please write a positive number.");
        }

        sc.close();
    }
}
