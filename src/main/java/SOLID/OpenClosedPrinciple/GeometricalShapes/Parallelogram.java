package SOLID.OpenClosedPrinciple.GeometricalShapes;

public class Parallelogram implements Shape{

    int side;
    int height;

    public Parallelogram() {

    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Parallelogram(int side, int height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double getArea() {
        return side * height;
    }
}
