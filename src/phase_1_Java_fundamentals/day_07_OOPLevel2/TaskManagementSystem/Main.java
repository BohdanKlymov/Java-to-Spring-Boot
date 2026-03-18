package phase_1_Java_fundamentals.day_07_OOPLevel2.TaskManagementSystem;

public class Main {
    public static void main(String[] args) {

        TaskManager manager = new TaskManager();

        Task t1 = new Task(1, "Learn Java");
        Task t2 = new Task(2, "Workout");

        manager.addTask(t1);
        manager.addTask(t2);

        manager.showAllTasks();

        System.out.println("----");

        manager.completeTask(1);

        manager.showAllTasks();
    }
}
