import entity.Bus;
import entity.Car;

public class DownCastingMain {
    public static void main(String[] args) {
        Car car = new Bus();
//    Bus bus = new Car();
//     Bus bus = (Bus)new Car();

        Car downCastCar = new Bus();
        Bus downCastBus = (Bus) downCastCar;
    }
}
