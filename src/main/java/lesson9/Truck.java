package lesson9;

public final class Truck extends Automobile{
    @Override
    void move(int n) {
        if (n<1200) {
            System.out.println("Грузовик проехал " + n + " км");
        } else System.out.println("Грузовик не может проехать " + n + " км на одном баке");
    }
}
