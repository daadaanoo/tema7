package tema7;

import java.io.Serializable;

public class PC implements Serializable {

    private static final long serialVersionUID = 1L;
    private final int power;
    private final String name;
    private final boolean issilicon;

    public PC(int power, String name, boolean isSafe) {
        this.power = power;
        this.name = name;
        this.issilicon = isSafe;
    }

    @Override
    public String toString() {
        return "PC{" + "power=" + power + "W" + ", name=" + name + ", issilicon=" + issilicon + '}';
    }

}
