package citytripTests;

import be.pxl.ja.citytrip.Attraction;
import be.pxl.ja.citytrip.Knapsack;
import be.pxl.ja.citytrip.KnapsackFullException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class KnapsackTest {
    private Attraction attraction1;
    private Attraction attraction2;
    private Attraction attraction3;

    @BeforeEach
    public void CreateAttractions(){
        attraction1 = new Attraction("Westminster Abbey", 7, 1/2.0);
        attraction2 = new Attraction("Globe Theater", 6, 1/2.0);
        attraction3 = new Attraction("National Theater", 9, 1.0);
    }

    @Test

    public void TestIfCurrentWeightIsCorrect(){
        Assertions.assertEquals(0.5, attraction1.getWeight());
    }

    @Test
    public void TestThatYouCantAddAttractionsPastTheMaxWeight(){
        Knapsack knapsack = new Knapsack(1);

        knapsack.add(attraction1);
        knapsack.add(attraction2);

        Assertions.assertThrows(KnapsackFullException.class, () ->
        {
            knapsack.add(attraction3);
        });
    }


}
