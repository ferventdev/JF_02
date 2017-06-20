package t04;

import t03.Stationary;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Aleksandr Shevkunenko on 20.06.2017.
 */
public class StationarySorter {
    public static void sortByName(List<Stationary> stationaries) {
        Collections.sort(stationaries, Comparator.comparing(Stationary::getName));
    }

    public static void sortByPrice(List<Stationary> stationaries) {
        Collections.sort(stationaries, Comparator.comparing(Stationary::getPrice));
    }

    public static void sortByPriceAndName(List<Stationary> stationaries) {
        Collections.sort(stationaries, Comparator.comparing(Stationary::getPrice).thenComparing(Stationary::getName));
    }

}
