package generyczne.zad2;

import generyczne.Car;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MyList<String> myList = new MyList<>(10);

        myList.add("Ala");
        myList.add("ma");
        myList.add("kota");
        System.out.println(myList.size());

        System.out.println(myList);

        System.out.println(myList.getElement(1));
        System.out.println(myList.getElement(10));

        List<Car> cars = new LinkedList<>();
        List<Car> cars2 = new ArrayList<>();

    }
}
