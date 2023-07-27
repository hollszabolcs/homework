import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareNumberListerTest {
    @Test
    void testIsvalid() {
        Assertions.assertTrue(SquareNumberLister.isValid(2));
        Assertions.assertFalse(SquareNumberLister.isValid(-1));
    }
}
