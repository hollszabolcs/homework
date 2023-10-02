import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.naming.PartialResultException;

public class BinarySearchTest {
    int[] testArray = {1, 3, 4, 22, 23, 25, 27};
    @Test
    void testBinarySearch(){
        Assertions.assertEquals(3, Search.binarySearch(testArray,22));
        Assertions.assertEquals(-1, Search.binarySearch(testArray,77));

    }


}
