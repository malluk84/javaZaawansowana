package adnotacje;

public class TeddyBear {
    private int age;
    @MaxLength(maxLength = 5)
    private String name;


    public TeddyBear(int age, String name) {
        this.age = age;
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalAccessException {
        this.name = name;
        if (!TeddyBearNameLengthValidator.validate(this)) {
            throw new IllegalArgumentException("Wrong name length");
        }
    }
}
