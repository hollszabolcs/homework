import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareNumberListerTest {
    @Test
    void testIsvalid() {
        Assertions.assertEquals(true, SquareNumberLister.isValid(2));
        Assertions.assertEquals(false, SquareNumberLister.isValid(-1));
    }
    @Test
    void testSqureNumbers() {
        Assertions.assertEquals( 9S, SquareNumberLister.SquareNumbers(3));
    }
}
