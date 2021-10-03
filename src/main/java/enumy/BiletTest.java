package enumy;

public class BiletTest {

    public static void main(String[] args) {
       Bilet.NORMALNY_GODZINNY.wyswietlDaneOBilecie();
       Bilet.ULGOWY_CALODNIOWY.wyswietlDaneOBilecie();

       Bilet biletPierwszy = Bilet.ULGOWY_GODZINNY;
       biletPierwszy.wyswietlDaneOBilecie();
       Bilet.BRAK_BILETU.wyswietlDaneOBilecie();

       biletPierwszy.name().equalsIgnoreCase("cos");

        System.out.println(Bilet.valueOf("NORMALNY_GODZINNy"));


    }
}
