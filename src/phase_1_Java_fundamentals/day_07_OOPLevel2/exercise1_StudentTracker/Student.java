package phase_1_Java_fundamentals.day_07_OOPLevel2.exercise1_StudentTracker;

public class Student {
    private String name;
    private int gradeLevel;
    private double averageScore;
    private double oldAverageScore;

    public Student(String name, int gradeLevel, double averageScore) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.averageScore = averageScore;
        this.oldAverageScore = averageScore;
    }

    public void study(double hours) {

        if ((averageScore += hours * 0.5) <= 100) {
            System.out.println("Your average score is " + averageScore + " now.");
        } else if ((averageScore += hours * 0.5) > 100) {
            averageScore = 100;
            System.out.println("Your have achieved the highest average score: " + averageScore);
        } else {
            System.out.println("Number of days cannot be negative!");
        }

    }

    public void takeExam(double score) {

    }


}
