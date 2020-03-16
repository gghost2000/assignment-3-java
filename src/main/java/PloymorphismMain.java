import entity.Bus;
import entity.Car;
import entity.Truck;

public class PloymorphismMain {
    public static void main(String[] args) {

        Car car = new Car();
        Car carOfBus = new Bus();
        Car carOfTruck = new Truck();

        car.run();
        carOfBus.run();
        carOfTruck.run();
    }
}
