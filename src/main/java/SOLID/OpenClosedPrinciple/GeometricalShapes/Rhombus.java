package SOLID.OpenClosedPrinciple.GeometricalShapes;

public class Rhombus implements Shape {

    int diag1, diag2;

    public Rhombus() {

    }

    public int getDiag1() {
        return diag1;
    }

    public void setDiag1(int diag1) {
        this.diag1 = diag1;
    }

    public int getDiag2() {
        return diag2;
    }

    public void setDiag2(int diag2) {
        this.diag2 = diag2;
    }

    public Rhombus(int diag1, int diag2) {
        this.diag1 = diag1;
        this.diag2 = diag2;
    }

    @Override
    public double getArea() {
        return (double) (diag1 * diag2) / 2;
    }
}
