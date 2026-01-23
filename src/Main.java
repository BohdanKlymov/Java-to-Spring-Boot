
public class Main {
    public static void main(String[] args) {
        int sum1 = (int)(Math.random() * 101);
        int sum2 = (int)(Math.random() * 101);

        System.out.println("Sum: " + (sum1 + sum2));

        if (sum2 != 0) {
            System.out.println("Remainder: " + (sum1 % sum2));
        } else {
            System.out.println("Remainder: cannot divide by zero");
        }


        boolean greater = (sum1 > sum2);
        System.out.println("Is greater: " + greater);
    }
}