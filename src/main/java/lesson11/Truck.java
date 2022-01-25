package lesson11;

public class Truck extends Automobile {

    private int gosnomer;
    private int speed;
    private int weight;
    private int length;
    private int width;
    private int height;
    private int w;

    public void setGosnomer(int gosnomer) {
        this.gosnomer = gosnomer;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    void nomer(int n) {
        System.out.println("Легковой автомобиль c гос. номером: " + n);
    }

    @Override
    void speed(int s) {
        try {
            if (s > 80) {
                System.out.println("Скорость автомобиля больше 80 км/ч: " + s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Скорость автомобиля: " + s);
    }

    @Override
    void weight(int w) {
        int w2 = w*2;
        try {
            if (w2 > 8000) {
                System.out.println("Вес автомобиля больше 8 тонн: " + w2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Вес автомобиля: " + w2);
    }


}