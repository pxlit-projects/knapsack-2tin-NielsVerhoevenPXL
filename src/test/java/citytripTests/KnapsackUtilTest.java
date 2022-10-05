package citytripTests;

import be.pxl.ja.citytrip.Attraction;
import be.pxl.ja.citytrip.Knapsack;
import be.pxl.ja.citytrip.KnapsackUtil;
import be.pxl.ja.citytrip.LondonAttractions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class KnapsackUtilTest {
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
    public void TestIfSortsFromHighestToLowest(){
        LondonAttractions londonAttractions = new LondonAttractions();
        Knapsack knapsack = new Knapsack(10);

        londonAttractions.add(attraction1);
        londonAttractions.add(attraction2);
        londonAttractions.add(attraction3);

        List<Attraction> copy = new ArrayList<>(londonAttractions.getItems());
        KnapsackUtil.fill(knapsack, londonAttractions);

        Assertions.assertNotEquals(copy, londonAttractions.getItems());
        Assertions.assertEquals(londonAttractions.getItems().get(0).getWeight(), 1);
    }
}
