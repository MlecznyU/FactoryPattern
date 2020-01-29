package Factory.Simple;

public class CarManufacture {
    private SimpleFactory factory;

    public CarManufacture(SimpleFactory factory) {
        this.factory = factory;
    }

    public void manufactureCar(String type) {
        Car car = factory.createCar(type);
        car.makeNoise();
    }
}
