package kolekcje;

import java.util.*;

public class Listy {

    public static void main(String[] args) {

        Set<String> startowa = new HashSet<>();
        startowa.add("Ala");
        startowa.add("Ala");

        List<String> strings = new ArrayList<>(startowa);
        strings.add("Ala");
        strings.add("Ala");
        strings.add("ma");
        strings.add("kota");
        strings.add("kota");
        strings.add("kota");

        wyswietlDuplikaty(strings);
        usunDuplikaty(strings);
        System.out.println(strings);
    }

    private static void usunDuplikaty(List<String> strings) {
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String omawiany = iterator.next();
            if (strings.indexOf(omawiany) != strings.lastIndexOf(omawiany)) {
                iterator.remove();
            }
        }


        /*for (String s : strings) {
            while (strings.indexOf(s) != strings.lastIndexOf(s)) {
                strings.remove(strings.lastIndexOf(s));
            }
        }*/
    }

    public static void wyswietlDuplikaty(List<String> lista) {
        List<String> duplicates = new ArrayList<>();
        for (String s : lista) {
            if (lista.indexOf(s) != lista.lastIndexOf(s)) {
                if (!duplicates.contains(s)) {
                    duplicates.add(s);
                }
            }
        }
        System.out.println(duplicates);
    }
}
