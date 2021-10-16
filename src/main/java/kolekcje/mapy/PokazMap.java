package kolekcje.mapy;

import java.util.LinkedHashMap;
import java.util.Map;

public class PokazMap {

    public static void main(String[] args) {

        Map<String, Integer> stringIntegerMap = new LinkedHashMap<>();

        stringIntegerMap.put("Ala", 1);
        stringIntegerMap.put("ma", 100);
        stringIntegerMap.put("kota", 10000);

        System.out.println(stringIntegerMap);

        stringIntegerMap.put("Ala", -1);

        System.out.println(stringIntegerMap);

        for (String key : stringIntegerMap.keySet()) {
            System.out.println("key: " + key + ", value: " + stringIntegerMap.get(key));
        }

        for (Map.Entry<String, Integer> pair : stringIntegerMap.entrySet()) {

            System.out.println(pair);
        }


    }
}
