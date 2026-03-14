package phase_1_Java_fundamentals.day_06_IntroductionToOOP.PracticeExercise1_FirstClass;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Max", 3);
        Dog dog2 = new Dog("Peter", 6);

        dog1.bark();
        dog1.introduce();

        dog2.bark();
        dog2.introduce();
    }
}
