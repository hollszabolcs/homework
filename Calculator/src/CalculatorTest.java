import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testFactorial() {
        int[] sumtestArray = {5, 2};

        Assertions.assertEquals(7, Calculator.getSum(sumtestArray));
        Assertions.assertEquals(3, Calculator.getDif(sumtestArray));
        Assertions.assertEquals(10, Calculator.getMulti(sumtestArray));
        Assertions.assertEquals(2, Calculator.getDivision(sumtestArray));
        Assertions.assertEquals(1, Calculator.getModulardiv(sumtestArray));
        Assertions.assertEquals(25, Calculator.getPower(5));
        Assertions.assertEquals(40, Calculator.getPercentage(sumtestArray));
        Assertions.assertEquals(120, Calculator.getFactorial(5));
        Assertions.assertEquals(3, Calculator.getSquareroot(9));


    }
}