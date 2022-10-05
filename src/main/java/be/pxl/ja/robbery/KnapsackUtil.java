package be.pxl.ja.robbery;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class KnapsackUtil {

    public KnapsackUtil(){

    }

    public static void fill(Knapsack knapsack, Shop shop){
        Collections.sort(shop.getItems(), new Comparator<Product>() {
            @Override
            public int compare(Product o2, Product o1) {
                return o1.compareTo(o2);
            }
        });

        for (Product product: shop.getItems()
             ) {
            knapsack.add(product);
        }
    }
}
