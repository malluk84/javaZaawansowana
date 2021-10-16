package kolekcje.sety.zad2;

public abstract class Figure implements Comparable<Figure> {

    public abstract double calculateArea();

    @Override
    public int compareTo(Figure o) {
        return Double.compare(this.calculateArea(), o.calculateArea());
    }


}
