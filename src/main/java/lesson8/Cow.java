package lesson8;

public class Cow extends Animals {

    public Cow(String name, int age, String color) {
        super(name, age, color);
    }

    public void makeSounds() {
        System.out.println("Корова мычит");
    }
}
