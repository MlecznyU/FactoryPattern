package Factory.Method.Manufacture;

import Factory.Method.Cars.Car;
import Factory.Method.Cars.EuropeanAudi;
import Factory.Method.Cars.EuropeanFerrari;
import Factory.Method.Cars.EuropeanVolvo;

public class EuropeanCarManufacture extends CarManufacture {
    protected Car createCar(String type) {
        if (type.equals("Audi")) {
            return new EuropeanAudi();
        } else if (type.equals("Volvo")) {
            return new EuropeanVolvo();
        } else if (type.equals("Ferrari")) {
            return new EuropeanFerrari();
        } else {
            throw new IllegalArgumentException("Unknown car." + type);
        }
    }
}

