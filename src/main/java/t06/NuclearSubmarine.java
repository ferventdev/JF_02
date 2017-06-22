package t06;

import t07.ExtraInfo;

/**
 * Created by Aleksandr Shevkunenko on 22.06.2017.
 */
@ExtraInfo("Powered with nuclear reactor.")
public class NuclearSubmarine {
    private final String project;
    private final String name;
    private final Engine engine = new Engine();

    public NuclearSubmarine(String project, String name) {
        this.project = project;
        this.name = name;
    }

    public boolean start() {
        return engine.turnOn();
    }

    private class Engine {
        final String type = "With nuclear reactor";
        boolean turnOn() {
            return true;
        }
    }
}
