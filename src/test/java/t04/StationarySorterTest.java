package t04;

import org.junit.Test;
import t03.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Aleksandr Shevkunenko on 20.06.2017.
 */
public class StationarySorterTest {
    private List<Stationary> stationaries = new ArrayList<>();

    {
        stationaries.add(new Eraser());
        stationaries.add(new Stapler());
        stationaries.add(new Pencil());
        stationaries.add(new Eraser());
        stationaries.add(new Notepad());
        stationaries.add(new Stapler());
        stationaries.add(new Pen());
        stationaries.add(new Notepad());
        stationaries.add(new Pencil());
        for (Stationary item : stationaries) System.out.println(item);
        System.out.println();
    }

    @Test
    public void sortByName() throws Exception {
        StationarySorter.sortByName(stationaries);
        for (Stationary item : stationaries) System.out.println(item);
        System.out.println();
    }

    @Test
    public void sortByPrice() throws Exception {
        StationarySorter.sortByPrice(stationaries);
        for (Stationary item : stationaries) System.out.println(item);
        System.out.println();
    }

    @Test
    public void sortByPriceAndName() throws Exception {
    }

}