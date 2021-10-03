package symulatorfarby.model;

public class Square extends Rectangle {

    public Square(double a) {
        super(a, a);
    }

    @Override
    public double getSurface() {
        return a * a;
    }
}
