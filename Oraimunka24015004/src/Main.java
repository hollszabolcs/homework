import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AlgorithmicRecap algorithmicRecap = new AlgorithmicRecap();
        System.out.println(algorithmicRecap.taskOneReverts("csoki"));
        System.out.println(algorithmicRecap.taskTwoIsPalindrome(algorithmicRecap.taskOneReverts("kek")));
        System.out.println(algorithmicRecap.taskThreeIsAnagram("alsma", "salma"));
        System.out.println(algorithmicRecap.taskFourCountNumbers("as12df8"));
        System.out.println(algorithmicRecap.taskFiveGetFactorial(5));
        System.out.println(algorithmicRecap.taskSixGetUniqueChar("aaaaqqqwweertgtggé"));
        System.out.println(algorithmicRecap.taskSevenGetAllUniqueChar("qaalmmak"));
        System.out.println(algorithmicRecap.taskEightSameAmountOfAb("albma", "aadsddb"));
        int[] numbers = {5, 3, 7, 6, 6};
        System.out.println(algorithmicRecap.taskNineArrayContains(numbers, 9));
        List<String> texts = new ArrayList<>();
        texts.add("galagonya");
        texts.add("rakéta");
        texts.add("gibraltár");
        System.out.println(algorithmicRecap.taskTenWhichString(texts, 'g'));
        int[] numbers2 = {3, 1, 2, 10, 1};
        System.out.println(algorithmicRecap.taskElevenReturnSum(numbers2));
        System.out.println(algorithmicRecap.taskTwelveIsPrime(5, 9));
        String[][] routes = {
                {"USA", "BRA"},
                {"JPN", "PHL"},
                {"BRA", "UAE"},
                {"UAE", "JPN"},
        };
        System.out.println(algorithmicRecap.taskThirteenFindMatthewKnight(routes));
    }
}
