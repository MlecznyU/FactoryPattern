package Factory.Method.Manufacture;

import Factory.Method.Cars.AmericanAudi;
import Factory.Method.Cars.AmericanFerrari;
import Factory.Method.Cars.AmericanVolvo;
import Factory.Method.Cars.Car;

public class AmericanCarManufacture extends CarManufacture {
    protected Car createCar(String type) {
        if (type.equals("Audi")) {
            return new AmericanAudi();
        } else if (type.equals("Volvo")) {
            return new AmericanVolvo();
        } else if (type.equals("Ferrari")) {
            return new AmericanFerrari();
        } else {
            throw new IllegalArgumentException("Unknown car." + type);
        }
    }
}
