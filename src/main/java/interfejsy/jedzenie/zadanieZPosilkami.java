package interfejsy.jedzenie;

public class zadanieZPosilkami {

    public static void main(String[] args) {
        Czlowiek czlowiek1 = new Czlowiek();
        Jedzacy czlowiek2 = new Czlowiek();

        Jedzacy[] tablicaObiektowImplementujacychTenInterfejs = new Jedzacy[]{czlowiek1, czlowiek2};

        int maxGram = -1, maxPosilkow = -1, indexMaxGram = -1, indexMaxPosilkow = -1;
        for (int i = 0; i < tablicaObiektowImplementujacychTenInterfejs.length; i++) {
            if (tablicaObiektowImplementujacychTenInterfejs[i].ileGramowzjedzone() > maxGram) {
                maxGram = tablicaObiektowImplementujacychTenInterfejs[i].ileGramowzjedzone();
                indexMaxGram = i;
            }
            if (tablicaObiektowImplementujacychTenInterfejs[i].ilePosilkowzjedzone() > maxPosilkow) {
                maxPosilkow = tablicaObiektowImplementujacychTenInterfejs[i].ilePosilkowzjedzone();
                indexMaxPosilkow = i;
            }
        }

        System.out.println("Najwiecej posilkow zjadl: " + tablicaObiektowImplementujacychTenInterfejs[indexMaxPosilkow]);
        System.out.println("Najwiecej gram zjadl: " + tablicaObiektowImplementujacychTenInterfejs[indexMaxGram]);
    }


}
