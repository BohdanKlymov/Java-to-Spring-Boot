package phase_1_Java_fundamentals.day_07_OOPLevel2.StudentTracker;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Bohdan", 10, 65.5);
        Student student2 = new Student("Alex", 13, -20); // test validation

        student1.study(3);
        student1.takeExam(80);
        student1.promote();

        student2.study(5);

        student1.displayInfo();
        student2.displayInfo();
    }
}
