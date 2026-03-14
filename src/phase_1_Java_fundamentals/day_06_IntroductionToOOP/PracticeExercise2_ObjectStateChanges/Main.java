package phase_1_Java_fundamentals.day_06_IntroductionToOOP.PracticeExercise2_ObjectStateChanges;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 50);
        Car car2 = new Car("Mercedes", 20);
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            car1.drive();
        }

        System.out.print("Write amount of fuel to fill up the car: ");
        int amount = sc.nextInt();
        car1.refuel(amount);

        car1.showStatus();

        car2.getBrand();

        sc.close();
    }
}
