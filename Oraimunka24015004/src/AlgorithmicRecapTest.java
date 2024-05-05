import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmicRecapTest {
    AlgorithmicRecap algorithmicRecap = new AlgorithmicRecap();

    @Test
    void testAlgorithmicRecap() {
        Assertions.assertEquals("ikosc", algorithmicRecap.taskOneReverts("csoki"));
        Assertions.assertEquals(true, algorithmicRecap.taskTwoIsPalindrome("kek"));
        Assertions.assertEquals(false, algorithmicRecap.taskTwoIsPalindrome("zold"));
        Assertions.assertEquals(true, algorithmicRecap.taskThreeIsAnagram("alsma", "salma"));
        Assertions.assertEquals(false, algorithmicRecap.taskThreeIsAnagram("alsmaa", "salma"));
        Assertions.assertEquals(11, algorithmicRecap.taskFourCountNumbers("as12df8"));
        Assertions.assertEquals(120, algorithmicRecap.taskFiveGetFactorial(5));
        Assertions.assertEquals("{1=é}", algorithmicRecap.taskSixGetUniqueChar("aaaaqqqwweertgtggé"));
        StringBuilder taskSevenResult = algorithmicRecap.taskSevenGetAllUniqueChar("qaalmmak");
        Assertions.assertEquals("qlk", taskSevenResult.toString());
        Assertions.assertEquals(true, algorithmicRecap.taskEightSameAmountOfAb("albma", "aadsddb"));
        Assertions.assertEquals(false, algorithmicRecap.taskEightSameAmountOfAb("aalbma", "aadsddb"));
        int[] numbers = {5, 3, 7, 6, 6};
        Assertions.assertEquals(true, algorithmicRecap.taskNineArrayContains(numbers, 7));
        Assertions.assertEquals(false, algorithmicRecap.taskNineArrayContains(numbers, 9));
        List<String> texts = new ArrayList<>();
        texts.add("galagonya");
        texts.add("rakéta");
        texts.add("gibraltár");
        StringBuilder taskTenResult = algorithmicRecap.taskTenWhichString(texts, 'g');
        Assertions.assertEquals("galagonya,gibraltár,", taskTenResult.toString());
        int[] numbers2 = {3, 1, 2, 10, 1};
        Integer[] taskEleven = {3, 4, 6, 16, 17};
        List<Integer> elevenList = new ArrayList<>();
        elevenList.addAll(List.of(taskEleven));
        Assertions.assertEquals(elevenList, algorithmicRecap.taskElevenReturnSum(numbers2));
        Assertions.assertEquals(false, algorithmicRecap.taskTwelveIsPrime(5, 9));
        Assertions.assertEquals(true, algorithmicRecap.taskTwelveIsPrime(5, 11));
        String[][] routes = {
                {"USA", "BRA"},
                {"JPN", "PHL"},
                {"BRA", "UAE"},
                {"UAE", "JPN"},
        };
        String[] taskThirteenArray = {"USA", "BRA", "UAE", "JPN", "PHL"};
        List<String> thirteenList = new ArrayList<>();
        thirteenList.addAll(List.of(taskThirteenArray));
        Assertions.assertEquals(thirteenList, algorithmicRecap.taskThirteenFindMatthewKnight(routes));
    }
}
