package symulatorfarby.model;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getSurface() {
        return Math.PI * radius * radius;
    }
}
