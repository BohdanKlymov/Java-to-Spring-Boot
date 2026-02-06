package phase_1_Java_fundamentals.day_04_Arrays_LoopingOverData;

public class PracticeExercise2_LoopingPatterns {
    public static void main(String[] args) {

        int[] numbers = {3, 7, 2, 9, 4};

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);

        int average = 0;
        for (int number : numbers) {
            average += number;
        }
        System.out.println(average / numbers.length);

        int max = numbers[0];
        int min = numbers[0];

        for (int n : numbers) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
