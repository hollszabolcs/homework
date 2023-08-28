import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StrongNumbersTest {
    @Test
    void testStrongNumbers(){
        Assertions.assertEquals(40585, StrongNumbers.getFactorialDigitSum(40585));
        Assertions.assertEquals(145, StrongNumbers.getFactorialDigitSum(145));
        Assertions.assertEquals(2, StrongNumbers.getFactorialDigitSum(2));
        Assertions.assertEquals(1, StrongNumbers.getFactorialDigitSum(1));
        Assertions.assertEquals(1, StrongNumbers.getFactorialDigitSum(1));
        Assertions.assertEquals(745, StrongNumbers.getFactorialDigitSum(146));

    }
}
