package powtorka.statycznosc;

import java.util.Objects;

public class Dog implements Comparable<Dog> {

    static int iloscPsow;
    int wiek;

    public Dog(int wiek) {
        this.wiek = wiek;
    }

    public static void jakaJestesKlasa() {

    }

    public void hau() {

    }

    @Override
    public String toString() {
        return "Dog{" +
                "wiek=" + wiek +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return wiek == dog.wiek;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wiek);
    }

    @Override
    public int compareTo(Dog o) {
        return Integer.compare(this.wiek, o.wiek);
    }
}
