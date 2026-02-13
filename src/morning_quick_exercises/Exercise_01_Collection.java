package morning_quick_exercises;

import java.util.ArrayList;

public class Exercise_01_Collection {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(10);
        nums.add(45);
        nums.add(12);
        nums.add(8);
        nums.add(10);
        nums.add(8);


        System.out.println(removeDuplicates(nums));
        System.out.println(keepOnlyEvenNumbers(nums));
        System.out.println(SortInDescendingOrder(nums));
    }


    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i).equals(nums.get(j))) {
                    nums.remove(j);
                    j--;
                }
            }
        }

        return nums;
    }

    public static ArrayList<Integer> keepOnlyEvenNumbers(ArrayList<Integer> nums) {
        for  (int n = 0; n < nums.size(); n++) {
            if (nums.get(n) % 2 != 0) {
                nums.remove(n);
                n--;
            }
        }
        return nums;
    }

    public static ArrayList<Integer> SortInDescendingOrder(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(j) < nums.get(i)) {
                    int  temp = nums.get(i);
                    nums.set(i, nums.get(j));
                    nums.set(j, temp);
                }
            }
        }
        return nums;
    }

}
