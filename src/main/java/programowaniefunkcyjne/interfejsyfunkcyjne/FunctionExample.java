package programowaniefunkcyjne.interfejsyfunkcyjne;

import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        Function<Employee, String> employeeToName = employee -> employee.getName();
        Function<Employee, Integer> emplyeeToAge = employee -> employee.getAge();
        Function<Employee, Employee> employeeFunction = employee -> employee;


        List<Employee> employees = Arrays.asList(new Employee("jan", 11), new Employee("Kowalski", 1));

        showEmplyee(employees, employeeToName);
        showEmplyee(employees, emplyeeToAge);
        showEmplyee(employees, employeeFunction);


    }

    static void showEmplyee(List<Employee> employees, Function showFunction) {
        for (Employee employee : employees) {
            System.out.println(showFunction.apply(employee));
        }
    }


}


@Data
class Employee {
    private final String name;
    private final int age;

}
