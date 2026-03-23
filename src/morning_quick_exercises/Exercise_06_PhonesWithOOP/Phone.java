package morning_quick_exercises.Exercise_06_PhonesWithOOP;

public class Phone {
    private String model;
    private int year;
    private float cost;

    public Phone(String model, int year, int cost) {
        this.model = model;
        this.year = Math.max(year, 0); Math.min(year, 2026);
        this.cost = Math.max(cost, 0);
    }

    public float use(int timeInYears) {
        if (timeInYears < 0) {
            System.out.println("This is not available time.");
            return cost;
        } else if (timeInYears <= 5) {
            cost = cost / 2;
            return cost;
        } else {
            cost = 0;
        }
        return cost;
    }

    public void showInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year of relise: " + year);
        System.out.println("Price of the phone: " + cost);
    }


}

