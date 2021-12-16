package lesson10;

public enum Systems {
    CELSIUS("C"), FAHRENHEIT("F"), KELVIN("K"); // ROOMERA("R")

    private final String shortName;

    Systems(String shortName) {
        this.shortName = shortName;
    }

    public static Systems of(String input) {
        for (Systems measurementSystem : values()) {
            if (measurementSystem.shortName.equalsIgnoreCase(input)) {
                return measurementSystem;
            }
        }
        return CELSIUS;
    }
}
