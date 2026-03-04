package phase_1_Java_fundamentals.day_06_Introduction_to_OOP.PracticeExercise2_ObjectStateChanges;

public class Car {
    private String brand;
    private int fuel;

    public Car(String brand, int fuel) {
        this.brand = brand;
        this.fuel = fuel;
    }

    public void drive() {
        if (fuel < 10) {
            System.out.println("Not enough fuel.");
        } else {
            System.out.println("Car is driving.");
            fuel -= 10;
        }
    }

    public void refuel(int amount) {
        if (amount < 0) {
            System.out.println("Cannot refuel negative amount.");
        } else {
            fuel += amount;
        }
    }

    public void showStatus() {
        System.out.println("Brand: " + brand);
        System.out.println("Amount of fuel: " + fuel);
    }

    public void getBrand() {
        System.out.println("Brand of the car: " + brand);
    }

    public void getFuel() {
        System.out.println("Fuel amount: " + fuel);
    }
}
