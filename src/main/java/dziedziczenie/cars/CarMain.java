package dziedziczenie.cars;

public class CarMain {

    public static void main(String[] args) {

        Car someCar = new Car("dirty", "cheap", (short) 1990);
        someCar.przyspiesz();
        someCar.przyspiesz();
        someCar.przyspiesz();
        System.out.println(someCar.isLightsOn());
        someCar.changeLights();
        System.out.println(someCar.isLightsOn());

        System.out.println("--------------------------");

        Cabriolet cabrio = new Cabriolet("dirty", "cheap", (short) 1990, true);
        cabrio.przyspiesz();
        cabrio.przyspiesz();
        cabrio.przyspiesz();
        System.out.println(cabrio.isLightsOn());
        cabrio.changeLights();
        System.out.println(cabrio.isLightsOn());

        System.out.println(cabrio.isRoofClosed());
        cabrio.openRoof();
        System.out.println(cabrio.isRoofClosed());

        final BrokenCabrio brokenCabrio = new BrokenCabrio(100, true);
        brokenCabrio.przyspiesz();

        // nie mozna przypisac wartosci do fianlnej zmiennje (czyli stalej)
        //brokenCabrio = null;

        brokenCabrio.openRoof();


    }
}
