package phase_1_Java_fundamentals.day_07_OOPLevel2.StudentTracker;

public class Student {
    private String name;
    private int gradeLevel;
    private double averageScore;

    public Student(String name, int gradeLevel, double averageScore) {
        this.name = name;
        this.gradeLevel = (gradeLevel >= 1 && gradeLevel <= 12) ? gradeLevel : 1;
        this.averageScore = Math.max(averageScore, 0);
    }

    public void study(double hours) {

        if (hours < 0) {
            System.out.println("Hours cannot be negative!");
            return;
        }

        double increase = hours * 0.5;
        this.averageScore += increase;

        if (this.averageScore > 100) {
            this.averageScore = 100;
        }

        System.out.println("New average score: " + this.averageScore);
    }

    public void takeExam(double score) {

        if (score < 0 || score > 100) {
            System.out.println("Invalid exam score!");
            return;
        }

        this.averageScore = (this.averageScore + score) / 2;

        System.out.println("Updated average score: " + this.averageScore);
    }

    public void promote() {

        if (this.gradeLevel < 12) {
            this.gradeLevel++;
            System.out.println("Promoted to grade: " + this.gradeLevel);
        } else {
            System.out.println("Already at maximum grade.");
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Grade: " + this.gradeLevel);
        System.out.println("Average Score: " + this.averageScore);
    }
}
