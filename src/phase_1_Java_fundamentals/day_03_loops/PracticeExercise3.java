package phase_1_Java_fundamentals.day_03_loops;

public class PracticeExercise3 {
    public static void main(String[] args) {

        for  (int i = 1; i <= 15; i++) {
            if (i % 3 == 0) {
                continue;
            }else {
                System.out.print(i + " ");
            }
        }
    }
}
