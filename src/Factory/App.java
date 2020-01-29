package Factory;



import Factory.Method.Manufacture.AmericanCarManufacture;
import Factory.Method.Manufacture.CarManufacture;
import Factory.Method.Manufacture.EuropeanCarManufacture;

public class App {
    public static void main(String[] args) {

      /*  System.out.println("Type Ferrari or Volvo or Audi");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        new CarManufacture().manufactureCar(input);
       */
        CarManufacture manufacture = new EuropeanCarManufacture();
        manufacture.manufactureCar("Ferrari");

        manufacture = new AmericanCarManufacture();
        manufacture.manufactureCar("Audi");


    }
}
