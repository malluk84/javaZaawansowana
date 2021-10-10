package interfejsy.interfejszstatycznametoda;

public class Main {

    public static void main(String[] args) {

        Pokazujacy zmiennaIntefejsu = new Pokazowa();
        zmiennaIntefejsu.metodaNiestatyczna();

        Pokazujacy.metodaStatyczna();
    }
}
