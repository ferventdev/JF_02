package t04;

import org.junit.Test;
import t03.*;

import java.util.ArrayList;
import java.util.Comparator;
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
//        printAll("Before sorting:");
    }

    private void printAll(String header) {
        System.out.println(header);
        for (Stationary item : stationaries) System.out.println(item);
        System.out.println();
    }

    private boolean checkSortingOrder(Comparator<Stationary> cmp) {
        for(int i = 0, n = stationaries.size() - 1; i < n; i++)
            if (cmp.compare(stationaries.get(i), stationaries.get(i + 1)) > 0) return false;
        return true;
    }

    @Test
    public void sortByNameTest() throws Exception {
        StationarySorter.sortByName(stationaries);
//        printAll("After sorting by name:");
        assertTrue(checkSortingOrder(Comparator.comparing(Stationary::getName)));
    }

    @Test
    public void sortByPriceTest() throws Exception {
        StationarySorter.sortByPrice(stationaries);
//        printAll("After sorting by price:");
        assertTrue(checkSortingOrder(Comparator.comparing(Stationary::getPrice)));
    }

    @Test
    public void sortByPriceAndNameTest() throws Exception {
        StationarySorter.sortByPriceAndName(stationaries);
//        printAll("After sorting by price and name:");
        assertTrue(checkSortingOrder(Comparator.comparing(Stationary::getPrice).thenComparing(Stationary::getName)));
    }
}