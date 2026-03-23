package morning_quick_exercises.Exercise_06_PhonesWithOOP;

public class Main {
    public static void main(String[] args) {
        Phone samsung = new Phone("Samsung A51", 2025, 2500);
        Phone iPhone = new Phone("iPhone 17", 2026, 5000);
        Phone poco = new Phone("Poco Cabum 02", 2016, 780);

        samsung.showInfo();
        System.out.println();

        iPhone.use(3);
        iPhone.showInfo();
        System.out.println();

        poco.showInfo();
    }
}
