package t01;

/**
 * Created by Aleksandr Shevkunenko on 19.06.2017.
 */
public class Pen {
    private final Type type;
    private final Color color;
    private final String manufacturer;

    enum Type { BALLPOINT, GEL }
    enum Color { BLACK, BLUE, GREEN, RED, VIOLET }

    public Pen(Type type, Color color, String manufacturer) {
        this.type = type;
        this.color = color;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "type = " + type +
                ", color = " + color +
                ", manufacturer = '" + manufacturer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pen pen = (Pen) o;

        if (type != pen.type) return false;
        if (color != pen.color) return false;
        return manufacturer != null ? manufacturer.equals(pen.manufacturer) : pen.manufacturer == null;
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        return result;
    }
}
