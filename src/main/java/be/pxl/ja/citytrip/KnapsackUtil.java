package be.pxl.ja.citytrip;

import java.util.Collections;

public class KnapsackUtil {
    public KnapsackUtil() {
    }

    public static void fill(Knapsack knapsack, LondonAttractions londonAttractions){
        londonAttractions.getItems().sort((Attraction o1, Attraction o2) -> {
            return o2.compareTo(o1);
        });

        for (Attraction attraction: londonAttractions.getItems()
             ) {
            knapsack.add(attraction);
        }
    }
}
