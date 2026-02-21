package morning_quick_exercises;
import java.util.Locale;
import java.util.Scanner;

public class Exercise_04_StringProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cV = convertTOlowercase(sc);
        System.out.println(cV);

        sc.close();
    }


    public static String convertTOlowercase(Scanner sc) {

        String input = sc.nextLine();

        input = input.toLowerCase(Locale.ROOT);

        return input;
    }
}
