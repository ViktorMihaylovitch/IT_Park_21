package lesson10;

public class Printer {

    private final double value;
    private final Systems measurementSystem;

    public Printer(double value, Systems measurementSystem) {
        this.value = value;
        this.measurementSystem = measurementSystem;
    }

    public double getValue() {
        return value;
    }

    public Systems getMeasurementSystem() {
        return measurementSystem;
    }
}
