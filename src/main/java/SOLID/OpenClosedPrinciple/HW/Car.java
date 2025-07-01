package SOLID.OpenClosedPrinciple.HW;

public class Car implements VehicleMethodsRepo {

    private String make;
    private String model;
    private int capacity;
    private double consumption;
    private double distance;

    public Car(String make, String model, double consumption, int capacity, double distance) {
        this.make = make;
        this.model = model;
        this.consumption = consumption;
        this.capacity = capacity;
        this.distance = distance;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getConsumption() {
        return consumption;
    }
    public int getCapacity() {
        return capacity;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String toString() {
        return make + " " + model + " " + consumption;
    }

    @Override
    public double calculatePrice() {
        return (getConsumption() * getDistance()) / getCapacity();
    }
}
