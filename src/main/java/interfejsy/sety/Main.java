package interfejsy.sety;


import powtorka.statycznosc.Dog;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
/*
        Set<String> strings = new HashSet<>();

        strings.add("Ala");
        strings.add("Ala");
        strings.add("Ala");

        System.out.println(strings);*/

        Dog one = new Dog(10);
        Dog two = new Dog(90);
        Dog three = new Dog(90);
        Dog four = new Dog(1);


        Set<Dog> dogs = new TreeSet<>();
        dogs.add(one);
        dogs.add(two);
        dogs.add(three);
        dogs.add(four);

        System.out.println(dogs);
    }
}
