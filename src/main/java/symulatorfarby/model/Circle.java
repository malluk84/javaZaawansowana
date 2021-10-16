package symulatorfarby.model;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Nie da sie stworzyc okregu z ujemnym promieniem");
        }
        this.radius = radius;
    }

    @Override
    public double getSurface() {
        return Math.PI * radius * radius;
    }
}
