package dziedziczenie.kolo;

public class Circle {
    protected final double PI = Math.PI;
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    protected final double calculateSurface() {
        return PI * radius * radius;
    }

    protected final double calculateSurface(boolean negative){
        return 2.0; // bez sensu, ale to nie to chcialem pokazac
    }

    protected final double calculateSurface(float value){
        return 2.0; // bez sensu, ale to nie to chcialem pokazac
    }

    protected final double calculateSurface(final double negative){
        return 2.0; // bez sensu, ale to nie to chcialem pokazac
    }
}
