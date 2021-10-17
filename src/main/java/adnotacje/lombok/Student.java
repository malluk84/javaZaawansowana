package adnotacje.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {

    private final String surname;
    private String name;
    private int age;
    private double average;

    /*
    Stworzyc klase Student
    Stworzyc liste paru studentow (ofc w innej klasie)
    Posortowac ich wg. malejcacej sredniej
    Wypisac liste
    Posortowac ich wg. rosnacej dlugosci nazwiska
    Wypisac liste
     */

}
