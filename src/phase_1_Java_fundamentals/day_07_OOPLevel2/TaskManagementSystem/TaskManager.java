package phase_1_Java_fundamentals.day_07_OOPLevel2.TaskManagementSystem;
import java.util.ArrayList;

public class TaskManager {

    private ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public Task findTask(int id) {
        for (Task task : tasks) {
            // we need a getter later, but for now:
            // assume you will add getId() in Task
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    public void completeTask(int id) {
        Task task = findTask(id);

        if (task == null) {
            System.out.println("Task not found");
            return;
        }

        task.completeTask();
    }

    public void showAllTasks() {
        for (Task task : tasks) {
            task.display();
        }
    }
}

