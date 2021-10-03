package dziedziczenie.cars;

public class Cabriolet extends Car {

    boolean isRoofClosed;

    @Override
    public void przyspiesz() {
        if (this.velocity + 10 >= 180) {
            this.velocity = 120;
        } else {
            this.velocity += 10;
        }
        System.out.println("Przyspieszam do " + this.velocity + " km/h.");
    }

    public Cabriolet(String color, String brand, short yearOfProduction, boolean isRoofClosed) {
        super(color, brand, yearOfProduction);
        this.isRoofClosed = isRoofClosed;
    }

    public void openRoof(){
        this.isRoofClosed = false;
    }

    public boolean isRoofClosed(){
        return this.isRoofClosed;
    }

    @Override
    public String toString() {
        return super.toString() + " z rozsuwanym dachem";
    }
}
