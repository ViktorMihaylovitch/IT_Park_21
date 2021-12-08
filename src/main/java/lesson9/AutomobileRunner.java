package lesson9;

public class AutomobileRunner {
    public static void main (String[] args){
        Car volkswagenPolo = new Car();
        Car mazdaCX7 = new Car();
        Car ladaGranta = new Car();
        Car toyotaPrius = new Car();
        Car skodaOctavia = new Car();
        Truck kamaz5320 = new Truck();
        Truck gaz3302 = new Truck();
        Truck maz5336 = new Truck();
        Truck uaz3303 = new Truck();
        Truck manTGL = new Truck();

        Automobile[] autos = new Automobile[]{volkswagenPolo, mazdaCX7, ladaGranta, toyotaPrius, skodaOctavia, kamaz5320,
                gaz3302, maz5336, uaz3303, manTGL};
        for (Automobile auto : autos) {
            auto.move((int) (Math.random() * 1000));
        }
    }
}
