package programowaniefunkcyjne.interfejsyfunkcyjne;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        String ala = " Ala ma kota ";

        System.out.println(ala);
        Consumer<String> stringTrim = (s) -> {
            s = s.trim();
            System.out.println(s);
        };


        stringTrim.accept(ala);

        trimValue(stringTrim, ala);

        System.out.println(ala);

    }

    static void trimValue(Consumer<String> stringConsumer, String s) {
        stringConsumer.accept(s);

    }


}
