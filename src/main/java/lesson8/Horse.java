package lesson8;

public class Horse extends Animals {

    public Horse(String name, int age, String color) {
        super(name, age, color);
    }

    public void makeSounds() {
        System.out.println("Лошадь ржёт");
    }
}