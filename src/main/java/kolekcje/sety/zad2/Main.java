package kolekcje.sety.zad2;

import generyczne.Car;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Figure one = new Circle(5);
        Figure two = new Circle(1);
        Figure three = new Circle(50);
        Figure four = new Square(4);
        Figure five = new Square(40);
        Figure six = new Square(-1);

        Set<Figure> figures = new TreeSet<>();
        figures.addAll(List.of(one, two, three, four, five, six));

        System.out.println(figures);

        Map<String, Car> map = new HashMap<>();

    }
}
