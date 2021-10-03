package dziedziczenie.cars;

public class BrokenCabrio extends Cabriolet {

    public BrokenCabrio(double velocity, boolean isLightsOn) {
        super("dirty","cheap", (short) 1990, true);
        this.isRoofClosed = true;
    }


    @Override
    public void openRoof() {
        System.out.println("Sry, roof broken");
    }
}
