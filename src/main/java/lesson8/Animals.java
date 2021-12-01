package lesson8;

public class Animals {
    private String name;
    private int age;
    private String color;
    public Animals(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void makeSounds() {
        System.out.println("Животное может издавать звуки");
    }
    public String toString() {
        return "Животное по кличке " +
                name + ", возраста " + age +
                " лет, и " + color + " окраса";
    }
}

