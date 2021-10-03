package abstrakcja;

public abstract class Animal {
    protected int age;

    public Animal(int age) {
        this.age = age;
    }

    public abstract void move();
}
