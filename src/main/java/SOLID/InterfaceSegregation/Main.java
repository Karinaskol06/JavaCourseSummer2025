package SOLID.InterfaceSegregation;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(12, 4);
        rectangle.draw();
        System.out.println(rectangle.getArea());

        Sphere sphere = new Sphere(4);
        sphere.draw();
        System.out.println(sphere.getVolume());
    }
}
