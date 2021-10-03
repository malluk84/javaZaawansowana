package abstrakcja;

public class MainAnimal {
    public static void main(String[] args) {
/*

        Animal some = new Animal();
        Mammal someMammal = new Mammal();
*/

        Cat cat = new Cat(10, false, "dirty");
        cat.move();
    }
}
