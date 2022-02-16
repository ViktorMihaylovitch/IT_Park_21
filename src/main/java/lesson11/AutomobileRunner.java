package lesson11;

public class AutomobileRunner {

    public static void main(String[] args) {
        Car volkswagenPolo = new Car(10, 80, 5, 4, 2, 2);
        Car mazdaCX7 = new Car(10, 80, 5, 4, 2, 2);
        Car ladaGranta = new Car(10, 80, 5, 4, 2, 2);
        Car toyotaPrius = new Car(10, 80, 5, 4, 2, 2);
        Car skodaOctavia = new Car(10, 80, 5, 4, 2, 2);
        Truck kamaz5320 = new Truck(10, 80, 5, 4, 2, 2);
        Truck gaz3302 = new Truck(10, 80, 5, 4, 2, 2);
        Truck maz5336 = new Truck(10, 80, 5, 4, 2, 2);
        Truck uaz3303 = new Truck(10, 80, 5, 4, 2, 2);
        Truck manTGL = new Truck(10, 80, 5, 4, 2, 2);
        Car mazda = new Car(10, 80, 1900, 4, 2, 2);
        mazda.printInfo();

        Automobile[] autos = new Automobile[]{volkswagenPolo, mazdaCX7, ladaGranta, toyotaPrius, skodaOctavia, kamaz5320,
                gaz3302, maz5336, uaz3303, manTGL};

     //   int[] array = new int[10];
    //    for (int item : array) {
     //       item = (int) Math.random();

        java.util.Random random = new java.util.Random();

        for (Automobile auto : autos) {
            auto.gosnomer((int) (100+Math.random() * 899));
        }

        int v = 20;
        int u = 65;
        for (Automobile auto : autos) {
            auto.speed((int) (v * random.nextGaussian() + u));
        }

        for (Automobile auto : autos) {
            auto.weight((int) (Math.random() * 3999 + 1400));
        }



    }



}
