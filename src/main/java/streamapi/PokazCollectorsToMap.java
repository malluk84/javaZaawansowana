package streamapi;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PokazCollectorsToMap {
    public static void main(String[] args) {
        Student student1 = new Student("Jan", "Kowalski", 3.0, 123456l);
        Student student2 = new Student("Asia", "Bartoszewicz", 5.0, 234567l);
        Student student3 = new Student("Aleksandra", "Helbt", 4.0, 345678l);

        Map<Long, Student> longStudentMap = Arrays.asList(student1, student2, student3).stream()
                .collect(Collectors.toMap(Student::getIndex, Function.identity()));
        System.out.println(longStudentMap);


        System.out.println("___________________________________");
        longStudentMap.entrySet().stream()
                .sorted()
                .collect(
                        Collectors.toMap(Map.Entry::getValue ,
                                        Map.Entry::getKey,
                                        (oldValue, newValue) -> newValue ,
                                        () -> new TreeMap<>(Comparator.comparingDouble(Student::getGpa))))
                .forEach((k, v) -> System.out.println("klucz: " + k + " a value:" + v) );

    }
}
@Data
@AllArgsConstructor
 class Student{
    private String name;
    private String surname;
    private Double gpa;
    private Long index;
 }
