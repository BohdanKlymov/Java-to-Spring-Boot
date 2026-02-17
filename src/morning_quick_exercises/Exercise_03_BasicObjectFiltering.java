package morning_quick_exercises;

import java.util.ArrayList;
import java.util.List;

public class Exercise_03_BasicObjectFiltering {

    static class User {
        String name;
        boolean active;

        User(String name, boolean active) {
            this.name = name;
            this.active = active;
        }
    }

    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Alice", true),
                new User("Bob", false),
                new User("Charlie", true)
        );

        System.out.println(getActiveUserNames(users));
    }

    public static List<String> getActiveUserNames(List<User> users) {
        List<String> result = new ArrayList<>();

        for (User user : users) {
            if (user.active) {
                result.add(user.name);
            }
        }

        return result;
    }
}
