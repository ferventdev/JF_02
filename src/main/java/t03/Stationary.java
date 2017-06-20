package t03;

/**
 * Created by Aleksandr Shevkunenko on 19.06.2017.
 */
public abstract class Stationary {
    private final String name;
    private final int price;

    public Stationary(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Stationary { " +
                "name = '" + name + '\'' +
                ", price = " + price +
                " }";
    }
}
