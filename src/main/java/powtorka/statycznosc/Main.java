package powtorka.statycznosc;

public class Main {

    public static void main(String[] args) {

        Dog.jakaJestesKlasa();

        Dog burek = new Dog(1);
        burek.hau();

        System.out.println();

        // metodaNiestatyczna(); error!

    }

    public void metodaNiestatyczna() {

    }


}
