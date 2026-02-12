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


//        Remove duplicates
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i).equals(nums.get(j))) {
                    nums.remove(j);
                    j--;
                }
            }
        }


//        Keep only even numbers
        for  (int n = 0; n < nums.size(); n++) {
            if (nums.get(n) % 2 != 0) {
                nums.remove(n);
            }
        }


//        Sort in descending order

    }

}
