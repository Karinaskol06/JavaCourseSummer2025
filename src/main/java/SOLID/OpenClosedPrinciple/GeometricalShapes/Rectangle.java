package SOLID.OpenClosedPrinciple.GeometricalShapes;

public class Rectangle implements Shape{
    protected int height;
    protected int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle() {

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }
}
