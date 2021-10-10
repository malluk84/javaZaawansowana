package interfejsy;

import java.util.Random;

public class Telefon implements Dzwoni {

    private String numerTelefonu;
    private int lacznyCzasRozmow;

    public Telefon(String numerTelefonu) {
        this.numerTelefonu = numerTelefonu;
        this.lacznyCzasRozmow = 0;
    }

    @Override
    public void zadzwon(String numer) {
        Random random = new Random();
        int wylosowana = random.nextInt(10);
        if (wylosowana < 3) {
            System.out.println("Nie udalo sie dodzwonic");
        } else {
            System.out.println("Dzwonie na numer:" + numer);
            int czasRozmowy = random.nextInt(60) + 1;
            this.lacznyCzasRozmow += czasRozmowy;
            System.out.println("Rozmawiales tyle minut: " + czasRozmowy);
        }
    }

    @Override
    public void zadzwonNaNumerAlarmowy() {
        zadzwon(Dzwoni.numerAlarmowy);
    }

    public String getNumerTelefonu() {
        return numerTelefonu;
    }

    public int getLacznyCzasRozmow() {
        return lacznyCzasRozmow;
    }
}
