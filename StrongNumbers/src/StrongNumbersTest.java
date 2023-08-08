import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StrongNumbersTest {
    @Test
    void testStrongNumbers() {
        Assertions.assertEquals(4, StrongNumbers.getFirstFactor(40585));
        Assertions.assertEquals(0, StrongNumbers.getSecondFactor(40585));
        Assertions.assertEquals(5, StrongNumbers.getThirdFactor(40585));
        Assertions.assertEquals(8, StrongNumbers.getFourthFactor(40585));
        Assertions.assertEquals(5, StrongNumbers.getFifthFactor(40585));
        Assertions.assertTrue(StrongNumbers.isStrongNumber(40585, 40585));
        Assertions.assertFalse(StrongNumbers.isStrongNumber(40583, 40585));


    }
}
