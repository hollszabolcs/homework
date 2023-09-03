import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StrongNumbersTest {
    @Test
    void testStrongNumbers(){
        Assertions.assertEquals(true, StrongNumbers.isStrongNumber(40585));
        Assertions.assertEquals(true, StrongNumbers.isStrongNumber(145));
        Assertions.assertEquals(false, StrongNumbers.isStrongNumber(146));

    }
}
