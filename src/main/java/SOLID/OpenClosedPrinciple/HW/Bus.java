package SOLID.OpenClosedPrinciple.HW;

public class Bus implements VehicleMethodsRepo {

    private double discount;
    private String make;
    private int capacity;
    private double consumption;
    private double distance;

    public Bus(double discount, String make, int capacity, double consumption, double distance) {
        this.discount = discount;
        this.make = make;
        this.capacity = capacity;
        this.consumption = consumption;
        this.distance = distance;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getMake() {
        return make;
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

    public double getConsumption() {
        return consumption;
    }


    public void setMake(String make) {
        this.make = make;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "discount=" + discount +
                ", make='" + make + '\'' +
                ", capacity=" + capacity +
                ", consumption=" + consumption +
                ", distance=" + distance +
                '}';
    }

    @Override
    public double calculatePrice() {
        return ((getConsumption() * getDistance()) / getCapacity() * getDiscount());
    }

}
