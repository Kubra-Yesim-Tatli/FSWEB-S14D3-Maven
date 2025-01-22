package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Gas engine started");
    }

    @Override
    public void drive() {
        System.out.println("Driving Gas powered car");
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println("Gas engine is running");
    }

    // getAverageKmPerLiter() metodunu ekliyoruz
    public double getAverageKmPerLiter() {
        return avgKmPerLitre;
    }

    // getCylinders() metodunu da ekliyoruz
    public int getCylinders() {
        return cylinders;
    }
}
