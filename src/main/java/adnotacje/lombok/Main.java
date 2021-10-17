package adnotacje.lombok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Przed spaniem");
        TimeUnit.SECONDS.sleep(10);
        System.out.println("Po spaniu");

        List<Student> students = new ArrayList<>();
        Collections.sort();
    }
}
