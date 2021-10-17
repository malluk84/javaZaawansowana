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

}
