import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StrongNumbersTest {
    @Test
    void testStrongNumbers(){
        Assertions.assertEquals(40585, StrongNumbers.getResult(40585));
        Assertions.assertEquals(145, StrongNumbers.getResult(145));
        Assertions.assertEquals(2, StrongNumbers.getResult(2));
        Assertions.assertEquals(1, StrongNumbers.getResult(1));
        Assertions.assertEquals(1, StrongNumbers.getResult(1));
        Assertions.assertEquals(745, StrongNumbers.getResult(146));

    }
}
