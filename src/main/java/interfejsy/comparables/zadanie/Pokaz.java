package interfejsy.comparables.zadanie;

import java.util.Arrays;

public class Pokaz {

    public static void main(String[] args) {

        Student jeden = new Student("Marcin", "Z", 123123);
        Student drugi = new Student("Pawel", "X", 10);
        Student trzeci = new Student("Zenek", "Y", 999999);

        Student[] students = new Student[]{jeden, drugi, trzeci};
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("##################");
        Arrays.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
