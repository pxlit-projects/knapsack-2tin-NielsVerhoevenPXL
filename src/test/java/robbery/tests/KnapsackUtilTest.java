package robbery.tests;

import be.pxl.ja.robbery.Knapsack;
import be.pxl.ja.robbery.KnapsackUtil;
import be.pxl.ja.robbery.Product;
import be.pxl.ja.robbery.Shop;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class KnapsackUtilTest {
    @Test
    public void TestIfListIsSortedCorrectly(){
        Knapsack knapsack = new Knapsack(70);

        Shop shop = new Shop();
        shop.add(new Product("laptop", 20, 2000));
        shop.add(new Product("guitar", 15, 1500));
        shop.add(new Product("stereo", 30, 3000));
        List<Product> copy = new ArrayList<>(shop.getItems());

        KnapsackUtil.fill(knapsack, shop);
        Assertions.assertEquals(shop.getItems().get(0).getPrice(), 3000);

    }
}
