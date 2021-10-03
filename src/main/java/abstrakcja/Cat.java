package abstrakcja;

public class Cat extends Mammal {
    private String color;

    public Cat(int age, boolean waterAnimal, String color) {
        super(age, waterAnimal);
        this.color = color;
    }

    @Override
    public void move() {
        System.out.println("Im going when and where I want");
    }
}
