package SOLID.OpenClosedPrinciple.HW;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Mercedes", "X2", 44.5, 5, 100);
        Car car2 = new Car("Volkswagen", "S2", 30.9, 6, 100);
        Car car3 = new Car("Kia", "W22", 50.5, 5, 100);

        Bus bus1 = new Bus(0.6, "BMW", 25, 180.9, 100);
        Bus bus2 = new Bus(0.3, "Opel", 40, 210, 100);
        Bus bus3 = new Bus(0.5, "Skoda", 25, 240.7, 100);

        Train train1 = new Train (190, 400, 100, true);
        Train train2 = new Train (130, 305, 100, false);
        Train train3 = new Train (250, 500, 100, true);

        List<VehicleMethodsRepo> vehicles = new ArrayList<>();
        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(car3);
        vehicles.add(bus1);
        vehicles.add(bus2);
        vehicles.add(bus3);
        vehicles.add(train1);
        vehicles.add(train2);
        vehicles.add(train3);

        PriceCalculatorService calculator = new PriceCalculatorService();

        vehicles.forEach(calculator::calculatePrice);
    }
}
