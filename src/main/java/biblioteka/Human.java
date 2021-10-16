package biblioteka;

import wyjatki.IllegalSurnameException;

import java.util.Objects;

public abstract class Human {

    protected String name;
    protected String surname;

    public Human(String name, String surname) {
        if (surname == null || surname.charAt(0) != surname.toUpperCase().charAt(0)) {
            throw new IllegalSurnameException(surname);
        }
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname);
    }

}
