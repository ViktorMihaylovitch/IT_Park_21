package lesson8;

public class Cat extends Animals {

    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    public void makeSounds() {
        System.out.println("Кот мяукает");
    }
}
