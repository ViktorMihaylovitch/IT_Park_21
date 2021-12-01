package lesson8;

public class Dog extends Animals {

    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    public void makeSounds() {
        System.out.println("Собака лает");
    }
}
