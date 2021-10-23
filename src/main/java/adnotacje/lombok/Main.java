package adnotacje.lombok;

import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

   /*     System.out.println("Przed spaniem");
        TimeUnit.SECONDS.sleep(10);
        System.out.println("Po spaniu");*/


        Student student01 = new Student("Pierwsadadaszy", "Pierwszy", 20, 3.5);
        Student student02 = new Student("Drugi", "Drugi", 20, 3.6);
        Student student03 = new Student("Trzeci", "Trzeci", 20, 3.7);
        Student student04 = new Student("Czwarty", "Czwarty", 20, 3.8);
        Student student05 = new Student("Pty", "Piąty", 20, 3.9);
        List<Student> students = new ArrayList<>(Arrays.asList(student01, student02, student03, student04, student05));
        System.out.println("Przed sortowaniem");
        System.out.println(students);

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return -1 * Double.compare(o1.getAverage(), o2.getAverage());
            }
        });
        Comparator<Student> comparator = (o1, o2) -> Double.compare(o1.getAverage(), o2.getAverage());
        Collections.sort(students, Comparator.comparingDouble(o -> o.getAverage()));
        Collections.sort(students, Comparator.comparingDouble(Student::getAverage));

        Collections.sort(students, Comparator.comparingInt(o -> o.getSurname().length()));

        System.out.println("Po sortowaniu po sredniej (malejaco)");
        System.out.println(students);

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getSurname().length(), o2.getSurname().length());
            }
        });

        System.out.println("Po posortowaniu wedle dlugosci nazwiska");
        System.out.println(students);
    }
}
