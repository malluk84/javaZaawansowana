package funkcyjne;

import java.util.Comparator;

public class PokazLambd {

    public static void main(String[] args) {


        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello!");
                System.out.println("Czesc");
            }
        };

        Runnable r2 = () -> {
            System.out.println("Hello");
            System.out.println("Czesc");
        };

        r.run();
        r2.run();


        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        Comparator<String> comparator1 = (String x, String y) -> x.compareTo(y);


        Funkcjonalny f = new Funkcjonalny() {
            @Override
            public int sth(Integer x) {
                return x * 10;
            }
        };
        f.sth(6);

        Funkcjonalny f1 = wartosc -> wartosc * 10;
        f1.sth(6);

    }
}
