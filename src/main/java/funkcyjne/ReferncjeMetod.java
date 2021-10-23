package funkcyjne;

import java.util.function.Consumer;

public class ReferncjeMetod {
    public static void main(String[] args) {


        Consumer<String> consumer = valueToAccept -> System.out.println(valueToAccept);

        System.out.println();
        Consumer<String> consume2 = System.out::println;

        Consumer<String> consume3 = String::length;
        ;

        consume2.accept("Ala ma kota");
        consume3.accept("Ala ma kota");

    }
}
