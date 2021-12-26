package lesson11;

public class Truck extends Automobile {

    private int gosnomer;
    private int speed;
    private int weight;
    private int length;
    private int width;
    private int height;

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
        if (n < 1200) {
            System.out.println("Грузовой автомобиль c гос. номером:" + n);
        } else System.out.println("Грузовой автомобиль c гос. номером:" + n);
    }

    @Override
    void speed(int s) {
        System.out.println("Скорость автомобиля:" + s);
    }

    @Override
    void weight(int w) {
        System.out.println("Вес автомобиля:" + w);
    }

}