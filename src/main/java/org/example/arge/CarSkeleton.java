package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Engine started");
    }

    public void drive() {
        System.out.println("Driving");
        runEngine();
    }

    protected void runEngine() {
        System.out.println("Running engine");
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}