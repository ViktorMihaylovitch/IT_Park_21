package lesson9;

public final class Car extends Automobile {
    @Override
    void move(int n) {
        if (n<500) {
            System.out.println("Легковой автомобиль проехал " + n + " км");
        } else System.out.println("Легковой автомобиль не может проехать " + n + " км на одном баке");
    }
}


