package phase_1_Java_fundamentals.day_04_Arrays_LoopingOverData;

import java.util.Scanner;
import java.util.HashMap;

public class StudentScoresAnalyzer {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> scoresOfStudents = new HashMap<String, Integer>();


        System.out.println("If you're finished, enter STOP!");

        boolean stopPoint =  false;


        while (!stopPoint) {

            System.out.println("Enter name of student: ");
            String name = scanner.nextLine();

            if (name.equals("STOP")) {
                stopPoint = true;
                break;
            }

            System.out.println("Enter his/her score in maths: ");
            int score = scanner.nextInt();
            scanner.nextLine();

            scoresOfStudents.put(name, score);
        }

        System.out.println(scoresOfStudents);


        float averageScore = 0;

        for (String key : scoresOfStudents.keySet()) {
            averageScore += scoresOfStudents.get(key);
        }

        System.out.println("Average score: " + (averageScore / scoresOfStudents.size()));

        scanner.close();

    }
}
