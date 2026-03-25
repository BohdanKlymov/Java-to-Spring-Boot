package morning_quick_exercises;
import java.util.*;

public class Exercise_05_FrequencyMap {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(
                List.of("apple", "banana", "apple", "orange", "banana", "apple")
        );

        System.out.println(countOccurrences(fruits));

        Map<String, Integer> sortedFruits = countOccurrences(fruits);

        for (Map.Entry<String, Integer> entry : sortedFruits.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    public static LinkedHashMap<String, Integer> countOccurrences(List<String> fruits) {
        LinkedHashMap<String, Integer> sortedFruits = new LinkedHashMap<>();
        HashMap<String, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < fruits.size(); i++) {
            String fruit = fruits.get(i);
            frequencyMap.put(fruit, frequencyMap.getOrDefault(fruit, 0) + 1);
        }

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());
        entryList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        for (Map.Entry<String, Integer> entry : entryList) {
            sortedFruits.put(entry.getKey(), entry.getValue());
        }

        return sortedFruits;
    }
}
