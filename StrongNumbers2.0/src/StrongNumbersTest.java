import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StrongNumbersTest {
    @Test
    void testStrongNumbers(){
        Assertions.assertTrue(StrongNumbers.isStrong(145,145));
        Assertions.assertFalse(StrongNumbers.isStrong(146,147));
        Assertions.assertEquals(145, StrongNumbers.getStrongNumber(145));
        Assertions.assertEquals(1, StrongNumbers.getStrongNumber(1));
        Assertions.assertEquals(2, StrongNumbers.getStrongNumber(2));
        Assertions.assertEquals(40585, StrongNumbers.getStrongNumber(40585));
    }
}
