package streamapi;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PokazStreamAPI {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Ala", "Ma", "Ma", "kota");

        Stream<String> stringStream = strings.stream();
        Set<String> stringSet =  stringStream

                .filter((slowo) -> slowo.charAt(0) == slowo.toLowerCase().charAt(0))
                .map(String::toUpperCase)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println(stringSet);
    }
}
