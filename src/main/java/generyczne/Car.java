package generyczne;

import java.util.Objects;

public abstract class Car {

    protected String marka;
    protected String model;
    protected String color;

    public Car(String marka, String model, String color) {
        this.marka = marka;
        this.model = model;
        this.color = color;
    }

    public void changeColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(marka, car.marka) &&
                Objects.equals(model, car.model) &&
                Objects.equals(color, car.color);
    }


}
