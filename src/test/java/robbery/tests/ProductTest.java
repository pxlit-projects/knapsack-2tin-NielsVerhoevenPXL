package robbery.tests;

import be.pxl.ja.robbery.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {
    @Test
    public void TestCompareToMethode(){
        Product chair = new Product("Chair", 15, 1);
        Product spoon = new Product("Spoon", 2, 55);
        Product fork = new Product("Fork", 20, 100);

        Assertions.assertEquals(chair.compareTo(spoon), -1);
        Assertions.assertEquals(spoon.compareTo(chair), 1);
    }
}
