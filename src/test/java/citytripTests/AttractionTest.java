package citytripTests;

import be.pxl.ja.citytrip.Attraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AttractionTest {
    private Attraction attraction1;
    private Attraction attraction2;
    private Attraction attraction3;

    @BeforeEach
    public void CreateAttractions() {
        attraction1 = new Attraction("Westminster Abbey", 7, 1 / 2.0);
        attraction2 = new Attraction("Globe Theater", 6, 1 / 2.0);
        attraction3 = new Attraction("National Theater", 9, 1.0);
    }

    @Test
    public void TestIfThisIsGreaterThanAttractionValueIsPossitive(){
        Assertions.assertEquals(1, attraction3.compareTo(attraction1));
    }
}
