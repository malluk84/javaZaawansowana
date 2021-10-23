package programowaniefunkcyjne.interfejsyfunkcyjne;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> predicate = (value) -> value >= 0 && value < 100;
        Predicate<String> predicateStrign = s -> s.charAt(0) == s.toUpperCase().charAt(0);


        checkTest(predicate, 10);
        checkTest(predicate, -5);
        checkTest(predicate, -5);
        /* Zle typy, blad!
        checkTest(predicateStrign, "ala");
        */
    }

    static void checkTest(Predicate<Integer> predicate, Integer valueToCheck) {
        System.out.println(predicate.test(valueToCheck));
    }
}
