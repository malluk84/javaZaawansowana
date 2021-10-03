package superheroes;

public class SuperheroTest {

    public static void main(String[] args) {


        Superhero spiderMan = new Superhero("Spider-Man","web");
        Superhero superman = new Superhero("Superman","power");

        spiderMan = superman;
        spiderMan = null;
        System.out.println(superman == null);

    }
}
