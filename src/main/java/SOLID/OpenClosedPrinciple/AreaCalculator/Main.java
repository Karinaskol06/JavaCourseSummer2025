package SOLID.OpenClosedPrinciple.AreaCalculator;

public class Main {
    public static void main(String[] args) {
        //abstraction to call the methods
        CalculatorService calculatorService = new CalculatorService();

        Addition addition = new Addition(2039, 192);
        Substraction substraction = new Substraction(2932, 991);
        Division division = new Division(3333, 11);

        calculatorService.calculate(addition);
        calculatorService.calculate(substraction);
        calculatorService.calculate(division);

        System.out.println(addition.getResult());
        System.out.println(substraction.getResult());
        System.out.println(division.getResult());
    }
}
