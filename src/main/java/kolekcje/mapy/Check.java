package kolekcje.mapy;

import java.util.*;

public class Check {

    public static void main(String[] args) {
        String input = "Ala ma kota a kota ma ale";
        String[] inputArray = input.split("");
        Set<String> lettersHashSet = getLettersFromInputArray(inputArray);
        Map<String, Set<Integer>> lettersLocation = getLettersLocation(input, lettersHashSet);
        System.out.println(lettersLocation);
    }

    private static Map<String, Set<Integer>> getLettersLocation(String input, Set<String> allTheLetters) {
        Map<String, Set<Integer>> lettersLocation = new HashMap<>();
        for (String letter : allTheLetters) {
            lettersLocation.put(letter, null);
        }
        for (String key : lettersLocation.keySet()) {
            Set<Integer> indexes = new LinkedHashSet<>();
            for (int i = 0; i < input.length(); i++) {
                if ((key.equals(Character.toString(input.charAt(i))))) {
                    indexes.add(i);
                }
                lettersLocation.put(key, indexes);
            }
        }
        return lettersLocation;
    }

    private static Set<String> getLettersFromInputArray(String[] inputArray) {
        Set<String> lettersHashSet = new HashSet<>();
        for (String letter : inputArray) {
            if (letter.equals(".") || letter.equals(",") || letter.equals(" ")) {
                continue;
            } else {
                lettersHashSet.add(letter);
            }
        }
        return lettersHashSet;
    }
}
