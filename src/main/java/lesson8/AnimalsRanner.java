package lesson8;

public class AnimalsRanner {
    public static void main(String[] args) {
        Cat Murzik = new Cat("Мурзик", 4, "рыжего");
        Rooster Petya = new Rooster("Петя", 3, "красного");
        Horse Voronoy = new Horse("Вороной", 6, "черного");
        Cow Milka = new Cow("Милка", 7, "черно-белого");
        Dog Bobik = new Dog("Бобик", 5, "коричневого");

        System.out.println(Murzik);
        System.out.println(Petya);
        System.out.println(Voronoy);
        System.out.println(Milka);
        System.out.println(Bobik);


        System.out.println("-------------------");

        Animals[] animals = new Animals[]{Murzik, Petya, Voronoy, Milka, Bobik};
        for (Animals animal : animals) {
            animal.makeSounds();
        }
    }
}
