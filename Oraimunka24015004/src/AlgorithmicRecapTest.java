import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class AlgorithmicRecapTest {
    AlgorithmicRecap algorithmicRecap = new AlgorithmicRecap();

    @Test
    void testAlgorithmicRecap() {
        Assertions.assertEquals("ikosc", algorithmicRecap.taskOneReverts("csoki"));
        Assertions.assertTrue(algorithmicRecap.taskTwoIsPalindrome(algorithmicRecap.taskOneReverts("kek")));
        Assertions.assertFalse(algorithmicRecap.taskTwoIsPalindrome("zold"));
        Assertions.assertTrue(algorithmicRecap.taskThreeIsAnagram("alsma", "salma"));
        Assertions.assertFalse(algorithmicRecap.taskThreeIsAnagram("alsmaa", "salma"));
        Assertions.assertEquals(BigInteger.valueOf(11), algorithmicRecap.taskFourCountNumbers("as12df8"));
        Assertions.assertEquals(120, algorithmicRecap.taskFiveGetFactorial(5));
        Assertions.assertEquals('é', algorithmicRecap.taskSixGetUniqueChar("aaaaqqqwweertgtggé"));
        Assertions.assertEquals("qlk", algorithmicRecap.taskSevenGetAllUniqueChar("qaalmmak"));
        Assertions.assertTrue(algorithmicRecap.taskEightSameAmountOfAb("albma", "aadsddb"));
        Assertions.assertFalse(algorithmicRecap.taskEightSameAmountOfAb("aalbma", "aadsddb"));
        Integer[] numbers = {5, 3, 7, 6, 6};
        Assertions.assertTrue(algorithmicRecap.taskNineArrayContains(numbers, 7));
        Assertions.assertFalse(algorithmicRecap.taskNineArrayContains(numbers, 9));
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
        Assertions.assertTrue(algorithmicRecap.taskTwelveIsRelativePrime(5, 9));
        Assertions.assertFalse(algorithmicRecap.taskTwelveIsRelativePrime(4, 8));
        String[][] routes = {
                {"HUN", "SK"},
                {"PL", "SLO"},
                {"SK", "RO"},
                {"RO", "PL"},
        };
        String[] taskThirteenArray = {"HUN", "SK", "RO", "PL", "SLO"};
        List<String> thirteenList = new ArrayList<>();
        thirteenList.addAll(List.of(taskThirteenArray));
        Assertions.assertEquals(thirteenList, algorithmicRecap.taskThirteenFindMatthewKnight(routes));
    }
}
