package LargestProduct;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LargestProductTest {
    LargestProduct largestProduct = new LargestProduct();
    @Test
    void LargestProductTest(){
        Assertions.assertEquals(20,largestProduct.getLargestProduct("602144509",2));
        Assertions.assertEquals(80,largestProduct.getLargestProduct("602144509",4));
        Assertions.assertEquals(160,largestProduct.getLargestProduct("602144509",5));
        Assertions.assertEquals(9,largestProduct.getLargestProduct("602144509",1));
        Assertions.assertEquals(-1,largestProduct.getLargestProduct("602144509",15));
        Assertions.assertEquals(-1,largestProduct.getLargestProduct("602144509",0));
        Assertions.assertEquals(-1,largestProduct.getLargestProduct("",1));
    }
}
