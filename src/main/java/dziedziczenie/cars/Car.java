package dziedziczenie.cars;

import java.util.Objects;

public class Car {
    protected double velocity;
    private boolean isLightsOn;
    protected String color;
    protected String brand;
    protected short yearOfProduction;

    public Car(String color, String brand, short yearOfProduction) {
        this.color = color;
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
    }


    public void przyspiesz() {
        if (this.velocity + 10 >= 120) {
            this.velocity = 120;
        } else {
            this.velocity += 10;
        }
        System.out.println("Przyspieszam do " + this.velocity + " km/h.");
    }

    public boolean isLightsOn() {
        return this.isLightsOn;
    }

    public void changeLights() {
        this.isLightsOn = !isLightsOn;
    }

    @Override
    public String toString() {
        return this.color + " samochód marki " + this.brand + " rocznik " + this.yearOfProduction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return (this.velocity == car.velocity);
    }


}
