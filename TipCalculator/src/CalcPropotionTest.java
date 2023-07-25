import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalcPropotionTest {
    @Test
    void testCalcPropotion() {
        Assertions.assertEquals(-1, TipCalculator.calcPropotion(50, 90));
        Assertions.assertEquals(-1, TipCalculator.calcPropotion(50, 9));
    }
}
