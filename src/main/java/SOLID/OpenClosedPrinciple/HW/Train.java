package SOLID.OpenClosedPrinciple.HW;

public class Train implements VehicleMethodsRepo {

    private int capacity;
    private double consumption;
    private double distance;
    private boolean luggage;

    public Train(int capacity, double consumption, double distance, boolean luggage) {
        this.capacity = capacity;
        this.consumption = consumption;
        this.distance = distance;
        this.luggage = luggage;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public boolean isLuggage() {
        return luggage;
    }

    public void setLuggage(boolean luggage) {
        this.luggage = luggage;
    }

    @Override
    public double calculatePrice() {
        if (luggage) return ((getDistance() * getConsumption()) / getCapacity()) + 100;
        else return ((getDistance() * getConsumption()) / getCapacity());
    }
}
