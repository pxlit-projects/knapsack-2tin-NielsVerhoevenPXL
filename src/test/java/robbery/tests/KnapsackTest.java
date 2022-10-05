package robbery.tests;

import be.pxl.ja.robbery.KnapSackFullException;
import be.pxl.ja.robbery.Knapsack;
import be.pxl.ja.robbery.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KnapsackTest {
    @Test

    public void TestIfTheCurrentWeightIsCorrect(){
        Knapsack knapsack = new Knapsack(35);
        Product chair = new Product("Chair", 15, 1);
        Product spoon = new Product("Spoon", 2, 55);
        knapsack.add(chair);
        knapsack.add(spoon);

        assertEquals(17, knapsack.getCurrentWeight());
    }

    @Test

    public void TestIfYouCanAddMoreThanTheMaxWeight(){
        Knapsack knapsack = new Knapsack(35);
        Product chair = new Product("Chair", 15, 1);
        Product spoon = new Product("Spoon", 2, 55);
        Product fork = new Product("Fork", 20, 100);

        knapsack.add(chair);
        knapsack.add(spoon);

        Assertions.assertThrows(KnapSackFullException.class, () -> {knapsack.add(fork);});
    }


}
