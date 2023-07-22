import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalcPropotionTest {
    @Test
 void testCalcPropotion(){
        Assertions.assertEquals(25, TipCalculator.calcPropotion(50,50));
    }
}
