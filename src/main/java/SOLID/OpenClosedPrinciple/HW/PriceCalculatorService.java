package SOLID.OpenClosedPrinciple.HW;

public class PriceCalculatorService {

    //we pass any object that can calculate price
    public void calculatePrice(VehicleMethodsRepo vehicle) {
        System.out.println(vehicle.calculatePrice());
    }
}
