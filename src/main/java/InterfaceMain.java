import entity.Animal;
import entity.Cat;

public class InterfaceMain {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.breath();
        cat.move();
        cat.defaultBreath();
        Animal.staticMove();

    }
}
