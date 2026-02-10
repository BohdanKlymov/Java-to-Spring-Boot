package morning_quick_exercises;

import java.util.ArrayList;

public class Exercise_01 {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(10);
        nums.add(45);
        nums.add(12);
        nums.add(8);
        nums.add(10);
        nums.add(8);

        int stopPoint = nums.size();

        while (stopPoint > 1) {
            for (int n = 0; n < stopPoint - 1; n++) {
                if (nums.get(n) > nums.get(n + 1)) {

                    int current = nums.get(n + 1);

                    nums.set(n + 1, nums.get(n));
                    nums.set(n, current);
                }
            }

            stopPoint--;
        }

        for (int n = 0; n < nums.size() - 1; n++) {
            System.out.print(nums.get(n) + " ");
        }
    }
}
