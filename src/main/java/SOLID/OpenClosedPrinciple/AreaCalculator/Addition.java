package SOLID.OpenClosedPrinciple.AreaCalculator;

public class Addition implements CalculatorOperation {
    int a;
    int b;
    int result;

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
        this.result = result;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Addition{" +
                "a=" + a +
                ", b=" + b +
                ", result=" + result +
                '}';
    }

    @Override
    public void calculation() {
        setResult(a + b);
    }
}
