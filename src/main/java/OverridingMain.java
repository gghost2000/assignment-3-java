import entity.Bus;
import entity.Car;

public class OverridingMain {
    public static void main(String[] args) {

        Car car = new Car();
        car.run();
        Bus bus = new Bus();
        bus.run();
        Car carOverride = new Bus();
        carOverride.run();
    }
}
