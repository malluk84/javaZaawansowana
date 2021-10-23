package rozneklasy.Zad3CarEngine;

import lombok.Data;
import lombok.ToString;

@Data
public class Car {
    private final String name;
    private final String type;
    private final Engine engine;

    public Car(String name, String type) {
        this.name = name;
        this.type = type;
        this.engine = new Engine(type);
    }

    @ToString
    class Engine {
        String engineType;

        public Engine(String carType) {
            this.engineType = getEngineType(carType);
        }

        public String getEngineType(String carType) {
            switch (carType) {
                case "luxury":
                    return "electric";
                case "economy":
                    return "diesel";
                default:
                    return "petrol";
            }
        }
    }
}
