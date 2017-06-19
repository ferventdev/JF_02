package t02;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Aleksandr Shevkunenko on 19.06.2017.
 */
public class Workspace {
    private final int id;
    private String employee;
    private Set<Stationary> items = new HashSet<>();

    public Workspace(int id, String employee) {
        this.id = id;
        this.employee = employee;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public boolean addItem(Stationary stationary) {
        return items.add(stationary);
    }

    public boolean hasItem(Stationary stationary) {
        return items.contains(stationary);
    }

    public int totalPrice() {
        int total = 0;
        for(Stationary item : items) total += item.getPrice();
        return total;
    }
}
