package adnotacje;

public class Main {

    public static void main(String[] args) {

        TeddyBear tb = new TeddyBear(10, "Albabababaabababababa");

        try {
            tb.setName("Aliabbaababbabaabaabab");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }
}
