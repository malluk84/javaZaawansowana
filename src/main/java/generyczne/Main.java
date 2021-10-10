package generyczne;

public class Main {

    public static void main(String[] args) {

        Car one = new Bmw("X7", "czerwone");
        Car two = new Porshe("Cayenne", "czarne");
        Car three = new Porshe("Cayenne", "czarne");


        Garage<Car> carGarage = new Garage<>(one, two);

        System.out.println(carGarage.getSthOut(one));
        System.out.println(carGarage.getSthOut(one));
        System.out.println("########################");
        System.out.println(carGarage.getSthOut(three));


    }
}
