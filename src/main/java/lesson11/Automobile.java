package lesson11;

public abstract class Automobile {

    protected int gosnomer;
    protected int speed;
    protected int weight;
    protected int length;
    protected int width;
    protected int height;

    protected Automobile(int gosnomer, int speed, int weight, int length, int width, int height) {
        this.gosnomer = gosnomer;
        this.speed = speed;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    abstract void gosnomer(int n);

    abstract void speed(int s);

    abstract void weight(int w);

}
