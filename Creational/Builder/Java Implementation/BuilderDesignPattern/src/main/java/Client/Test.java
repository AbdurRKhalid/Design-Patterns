package Client;

import ConcreteBuilder.CarBuilder;
import Director.Director;
import Product.Car;

public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car car = carBuilder.getResult();
        System.out.println("Car Built: " + car.getCarType());
    }
}
