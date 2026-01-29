package phase_1_Java_fundamentals.day_02_if_else_switch;
import java.util.Scanner;

public class Exercise_3_LoginSimulation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Print username:");
        String usernameInput = sc.nextLine();
        String username = usernameInput.trim();

        System.out.print("Print password:");
        int password = sc.nextInt();

        switch(username){
            case "admin":
                if (password == 1234) {
                    System.out.println("Login successful");
                    break;
                }
            default:
                System.out.println("Invalid credentials");
        }
        sc.close();
    }
}
