import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiagonialDifferenceTest {
    @Test

    void testDiagonialDifference(){
        int[][] testmatrix= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] testmatrixtwo=  {
                {1, 2, 3, 4, 7},
                {5, 5, 5, 5, 2},
                {1, 1, 0, 0, 0},
                {0, 2, 3, 4, 1},
                {0, 1, 1, 2, 2},
        };
        Assertions.assertEquals(0, DiagonalDifference.getDiagonialDifference(3, testmatrix));
        Assertions.assertEquals(-2, DiagonalDifference.getDiagonialDifference(5,testmatrixtwo));
    }
}
