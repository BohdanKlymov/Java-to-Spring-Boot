package morning_quick_exercises;

import java.util.ArrayList;
import java.util.List;

public class Exercise_02_SimpleFiltering {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(23);
        list.add(45);
        list.add(8);
        list.add(12);
        list.add(93);
        list.add(2);
        list.add(4);

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) < 10) {
                list.remove(i);
            }
        }

        System.out.println(list);
    }

}
