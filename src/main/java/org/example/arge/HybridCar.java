package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Hybrid engine started");
    }

    @Override
    public void drive() {
        System.out.println("Driving Hybrid car");
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println("Hybrid engine is running");
    }

    // getAvgKmPerLiter() metodunu ekliyoruz
    public double getAvgKmPerLiter() {
        return avgKmPerLitre;
    }

    // getBatterySize() metodunu ekliyoruz
    public int getBatterySize() {
        return batterySize;
    }

    // getCylinders() metodunu ekliyoruz
    public int getCylinders() {
        return cylinders;
    }
}
