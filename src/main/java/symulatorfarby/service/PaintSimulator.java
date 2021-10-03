package symulatorfarby.service;

import symulatorfarby.model.Figure;

public class PaintSimulator {

    public static double calculatePaintDemand(Figure[] figures, double canCapacity) {
        double currentSum = 0;
        for (Figure figure : figures) {
            currentSum += figure.getSurface();
        }
        return Math.ceil(currentSum / canCapacity);
    }
}
