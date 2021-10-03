package dziedziczenie.kolo;

public class MyCircle extends Circle {

    protected final double PI = Math.PI + 1;

    public MyCircle(double radius) {
        super(radius);
    }

    // nie mozna nadpisac konstruktora
    /*public Circle(final double radius) {
        super(radius);
        System.out.println("Say sth");
    }*/

    // nie mozna nadpisac finalnej metody
    /*@Override
    protected final double calculateSurface(){
        return 2.0;//do sth
    }*/
}
