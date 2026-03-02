package morning_quick_exercises;
import java.util.Locale;
import java.util.Scanner;

//  Exercise: Count Vowels

public class Exercise_04_StringProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = convertTOlowercase(sc);

        System.out.println(countVowels(input));

        sc.close();
    }


    public static String convertTOlowercase(Scanner sc) {

        System.out.print("Write a random Text: ");
        String input = sc.nextLine();

        input = input.toLowerCase(Locale.ROOT);

        return input;
    }

    public static int countVowels(String input) {
        if (input == null) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toLowerCase(input.charAt(i));

            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
            }
        }

        return count;
    }
}
