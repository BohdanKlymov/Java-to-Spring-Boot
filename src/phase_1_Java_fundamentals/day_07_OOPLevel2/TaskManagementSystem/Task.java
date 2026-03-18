package phase_1_Java_fundamentals.day_07_OOPLevel2.TaskManagementSystem;

public class Task {
    private int id;
    private String title;
    private boolean completed;

    public Task (int id, String title) {
        this.id = id;
        this.title = title;
        this.completed = false;
    }

    public void completeTask() {
        if (!completed) {
            completed = true;
        }
    }

    public void rename(String newTitle) {
        if (newTitle == null || newTitle.isEmpty()) {
            System.out.println("Invalid title.");
            return;
        }
        this.title = newTitle;
    }

    public void display() {
        String status = completed ? "[x]" : "[ ]";
        System.out.println(status + " " + id + " - " + title);
    }

    public int getId() {
        return id;
    }
}
