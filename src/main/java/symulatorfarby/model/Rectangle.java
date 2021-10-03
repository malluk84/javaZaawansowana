package symulatorfarby.model;

public class Rectangle extends Figure {

    protected double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getSurface() {
        return a * b;
    }
}
