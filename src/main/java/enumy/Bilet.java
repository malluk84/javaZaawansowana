package enumy;

public enum Bilet {

    ULGOWY_GODZINNY(1.6d, 1),
    ULGOWY_CALODNIOWY(7.0d, 24),
    NORMALNY_GODZINNY(3.2d, 1),
    NORMALNY_CALODNIOWY(14.0d, 24),
    BRAK_BILETU(0.0d, 0);

    private double cena;
    private int czasJazdyWGodzinach;

    Bilet(double cena, int czasJazdyWGodzinach) {
        this.cena = cena;
        this.czasJazdyWGodzinach = czasJazdyWGodzinach;
    }

    public double getCena() {
        return cena;
    }

    public int getCzasJazdyWGodzinach() {
        return czasJazdyWGodzinach;
    }

    public void wyswietlDaneOBilecie() {
        System.out.println("Jestem biletem: " + this.name()
                + " kosztuje: " + this.getCena() + ", starczam na tyle godzin: "
                + this.getCzasJazdyWGodzinach()
                + " moja pozycja to: " + this.ordinal())
        ;
    }

    @Override
    public String toString() {
        return "Bilet{" +
                "cena=" + cena +
                ", czasJazdyWGodzinach=" + czasJazdyWGodzinach +
                '}';
    }


    public static Bilet getOdpowiedniBilet(int wiek, int czasJazdy, double dostepnaKwota) {
        Bilet odpowiedniBilet = null;
        if (wiek > 18) {
            if (czasJazdy > 60) {
                odpowiedniBilet = Bilet.NORMALNY_CALODNIOWY;
            } else {
                odpowiedniBilet = Bilet.NORMALNY_GODZINNY;
            }
        } else {
            if (czasJazdy > 60) {
                odpowiedniBilet = Bilet.ULGOWY_CALODNIOWY;
            } else {
                odpowiedniBilet = Bilet.ULGOWY_GODZINNY;
            }
        }
        if (odpowiedniBilet.getCena() > dostepnaKwota) {
            odpowiedniBilet = Bilet.BRAK_BILETU;
        }

        return odpowiedniBilet;
    }
}
