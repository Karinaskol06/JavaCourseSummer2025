package SOLID.InterfaceSegregation;

public class Sphere implements Shape, Shape3D{

    private int radius;

    public Sphere() {
    }

    public Sphere(int radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return (double) (4 / 3) * Math.PI * radius * radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing sphere");
    }
}
