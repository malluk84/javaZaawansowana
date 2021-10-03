package abstrakcja;

public abstract class Mammal extends Animal{

    boolean waterAnimal;

    public Mammal(int age, boolean waterAnimal) {
        super(age);
        this.waterAnimal = waterAnimal;
    }

    public void suck(){
        //do sth
    }
}
