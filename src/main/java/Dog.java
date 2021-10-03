public class Dog {
    private String name;
    private final String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void woof() {
        System.out.println("Woof woof!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
