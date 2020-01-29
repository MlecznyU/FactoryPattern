package Factory.Method.Manufacture;

import Factory.Method.Cars.Car;

public abstract class CarManufacture {
    public void manufactureCar(String type) {
        Car car = createCar(type);
        car.makeNoise();
    }

    protected abstract Car createCar(String type);
}

