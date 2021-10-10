package interfejsy.jedzenie;

public class Czlowiek implements Jedzacy {
    private int ilePosilkow;
    private int ileGramow;


    @Override
    public String toString() {
        return "Czlowiek{" +
                "ilePosilkow=" + ilePosilkow +
                ", ileGramow=" + ileGramow +
                '}';
    }

    @Override
    public int ilePosilkowzjedzone() {
        return ilePosilkow;
    }

    @Override
    public int ileGramowzjedzone() {
        return ileGramow;
    }
}
