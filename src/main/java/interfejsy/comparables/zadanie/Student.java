package interfejsy.comparables.zadanie;

public class Student implements Comparable {
    String imie;
    String nazwisko;
    int nrindeksu;

    public Student(String imie, String nazwisko, int nrindeksu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrindeksu = nrindeksu;
    }

    @Override
    public int compareTo(Object o) {
        Student other = (Student) o;
        return -Integer.compare(this.nrindeksu, other.nrindeksu);
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", nrindeksu=" + nrindeksu +
                '}';
    }
}
