package symulatorfarby;

import symulatorfarby.model.*;
import symulatorfarby.service.PaintSimulator;

public class Main {
    public static void main(String[] args) {
        Figure figureOne = new Circle(5); // 78,5
        Figure figureTwo = new Square(5); // 25
        Figure figureThree = new Rectangle(5, 10); // 50
        Figure figureFour = new Trapeze(1, 2, 5); // 7,5

        Figure[] figures = new Figure[]{figureFour, figureOne, figureThree, figureTwo};

        System.out.println(PaintSimulator.calculatePaintDemand(figures, 10.0));

    }
}
