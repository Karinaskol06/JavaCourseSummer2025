package SOLID.OpenClosedPrinciple.GeometricalShapes;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(31);
        System.out.println(rectangle.getArea());

        Square square = new Square();
        square.setSide(23);
        System.out.println(square.getArea());

        Parallelogram parallelogram = new Parallelogram();
        parallelogram.setSide(23);
        parallelogram.setHeight(2);
        System.out.println(parallelogram.getArea());

        Rhombus rhombus = new Rhombus(12, 2);
        System.out.println(rhombus.getArea());
    }
}
