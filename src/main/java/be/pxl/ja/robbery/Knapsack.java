package be.pxl.ja.robbery;

import be.pxl.ja.citytrip.KnapsackFullException;

import java.util.ArrayList;
import java.util.List;

public class Knapsack {
    private double maximumCapacity;
    private List<Product> items;

    public Knapsack(double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        items = new ArrayList<>();
    }

    public double getCurrentWeight() {
        double sum = 0;
        for (Product product : items
        ) {
            sum += product.getWeight();

        }
        return sum;
    }

    public void add(Product product) {
        try {
            if (getCurrentWeight() + product.getWeight() > maximumCapacity) {
                throw new KnapSackFullException(String.format("cannot add product [%s]. Maximum capacity reached\n\n" +
                        "List of products:\n%s", product.getName(), getItems().toString()));
            } else {
                items.add(product);
            }
        } catch (KnapSackFullException e) {
            System.out.println(e);
        }


    }

    public List<Product> getItems() {
        return items;
    }
}
