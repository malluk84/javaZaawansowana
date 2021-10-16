package kolekcje.mapy;

import java.util.*;

public class Zad5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wczytany = scanner.nextLine();

        List<Map.Entry<String, Integer>> listaWpisow = new ArrayList<>(zliczWystapieniaSlow(wczytany).entrySet());

        listaWpisow.sort(Map.Entry.comparingByValue());
        Collections.reverse(listaWpisow);
        System.out.println(listaWpisow);


    }

    public static Map<String, Integer> zliczWystapieniaSlow(String tekst) {
        String[] slowa = tekst.toLowerCase().split("\\W+");
        Map<String, Integer> mapaWystapien = new LinkedHashMap<>();

        for (int i = 0; i < slowa.length; i++) {
            if (mapaWystapien.containsKey(slowa[i])) {
                mapaWystapien.put(slowa[i], mapaWystapien.get(slowa[i]) + 1);
            } else {
                mapaWystapien.put(slowa[i], 1);
            }
        }

        return mapaWystapien;
    }
}
