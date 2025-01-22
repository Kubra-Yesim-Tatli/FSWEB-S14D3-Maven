package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("Electric engine started");
    }

    @Override
    public void drive() {
        System.out.println("Driving Electric car");
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println("Electric engine is running");
    }

    // getAvgKmPerCharge() metodunu ekliyoruz
    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    // getBatterySize() metodunu ekliyoruz
    public int getBatterySize() {
        return batterySize;
    }
}
