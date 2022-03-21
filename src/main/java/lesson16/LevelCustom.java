package lesson16;

import java.util.logging.Level;

public class LevelCustom extends Level {
    protected LevelCustom(String name, int value) {
        super(name, value);
    }

    protected LevelCustom(String name, int value, String resourceBundleName) {
        super(name, value, resourceBundleName);
    }
}
