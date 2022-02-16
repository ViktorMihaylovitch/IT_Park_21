package lesson11;

public class Truck extends Automobile {

    public Truck(int gosnomer, int speed, int weight, int length, int width, int height) {
        super(gosnomer, speed, weight, length, width, height);
    }

    @Override
    void gosnomer(int n) {
        System.out.println("Легковой автомобиль c гос. номером:" + n);
        this.gosnomer = n;
    }

    @Override
    void speed(int s) {
        try {
            if (s > 80) {
                System.out.println("Скорость грузового автомобиля с гос. номером " + gosnomer + " больше 80 км/ч:" + s);
            } else {
                System.out.println("Скорость грузового автомобиля с гос. номером " + gosnomer + ": "  + s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    void weight(int w) {
        try {
            if (w > 8000) {
                System.out.println("Вес автомобиля больше 8 тонн:" + w);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Вес автомобиля:" + w);
    }

}

