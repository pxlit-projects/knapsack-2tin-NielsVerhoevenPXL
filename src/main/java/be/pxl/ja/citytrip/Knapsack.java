package be.pxl.ja.citytrip;

import java.util.ArrayList;
import java.util.List;

public class Knapsack {
    private double maximumCapacity;
    private List<Attraction> items;

    public Knapsack(double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        items = new ArrayList<>();
    }

    public double getCurrentWeight() {
        double sum = 0;
        for (Attraction Attraction : items
        ) {
            sum += Attraction.getWeight();

        }
        return sum;
    }

    public void add(Attraction Attraction) {

        if (getCurrentWeight() + Attraction.getWeight() > maximumCapacity) {
            throw new KnapsackFullException(String.format("cannot add Attraction [%s]. Maximum capacity reached\n\n" +
                    "List of Attractions:\n%s", Attraction.getName(), getItems().toString()));
        } else {
            items.add(Attraction);
        }


    }

    public List<Attraction> getItems() {
        return items;
    }
}
