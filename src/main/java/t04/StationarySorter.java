package t04;

import t03.Stationary;

import java.util.Collections;
import java.util.List;

/**
 * Created by Aleksandr Shevkunenko on 20.06.2017.
 */
public class StationarySorter {
    public static void sortByName(List<Stationary> stationaries) {
        Collections.sort(stationaries, (a, b) -> a.getName().compareTo(b.getName()));
    }

    public static void sortByPrice(List<Stationary> stationaries) {
        Collections.sort(stationaries, (a, b) -> Integer.compare(a.getPrice(), b.getPrice()));
    }

    public static void sortByPriceAndName(List<Stationary> stationaries) {
        Collections.sort(stationaries, (a, b) -> {
            int res = Integer.compare(a.getPrice(), b.getPrice());
            return res == 0 ? a.getName().compareTo(b.getName()) : res;
        });
    }

}
