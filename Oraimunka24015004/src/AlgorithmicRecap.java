import java.math.BigInteger;
import java.util.*;

public class AlgorithmicRecap {
    public String taskOneReverts(String text) {
        String result = "";
        for (int i = text.length(); i >= 1; i--) {
            char charcter = text.charAt(i - 1);
            result = result + charcter;
        }
        return result;
    }

    boolean taskTwoIsPalindrome(String text) {
        return text.equals(taskOneReverts(text));
    }

    boolean taskThreeIsAnagram(String text, String text2) {
        Map<Character, Integer> map = getCharacters(text);
        Map<Character, Integer> map2 = getCharacters(text2);
        return map.equals(map2);
    }

    private HashMap<Character, Integer> getCharacters(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
            } else {
                map.put(character, 1);
            }
        }
        return map;
    }

    BigInteger taskFourCountNumbers(String text) {
        BigInteger result = BigInteger.valueOf(0);
        for (int i = 0; i < text.length(); i++) {
            Character character = text.charAt(i);
            if (Character.isDigit(character)) {
                result = result.add(BigInteger.valueOf(Character.getNumericValue(character)));
            }
        }
        return result;
    }

    int taskFiveGetFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    char taskSixGetUniqueChar(String text) {
        Map<Integer, Character> map = new HashMap<>();
        int key = 0;
        char result = ' ';
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (map.containsValue(character)) {
                map.put(key + 1, character);
            } else {
                map.put(key + 1, character);
                result = character;
            }
        }
        return result;
    }

    String taskSevenGetAllUniqueChar(String text) {
        String result = "";
        List<Character> blacklist = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            for (int j = i + 1; j < text.length(); j++) {
                char tempChar = text.charAt(j);
                if (tempChar == character) {
                    counter++;
                }
            }
            if (counter == 0 && !blacklist.contains(character)) {
                result += character;
            } else {
                blacklist.add(character);
                counter = 0;
            }
        }
        return result;
    }

    boolean taskEightSameAmountOfAb(String text, String text2) {
        return (countSimilarChar('a', text) == countSimilarChar('a', text2))
                && countSimilarChar('b', text) == countSimilarChar('b', text2);
    }

    private int countSimilarChar(char getChar, String text) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (character == getChar) {
                counter++;
            }
        }
        return counter;
    }

    boolean taskNineArrayContains(Integer[] numbers, Integer number) {
        List<Integer> list = Arrays.asList(numbers);
        Set<Integer> set = new HashSet<>(list);
        if (set.contains(number)) {
            return true;
        }
        return false;
    }

    StringBuilder taskTenWhichString(List<String> texts, char character) {
        StringBuilder result = new StringBuilder();
        for (String text : texts) {
            for (int i = 0; i < text.length(); i++) {
                char getChar = text.charAt(i);
                if (getChar == character) {
                    result.append(text + ",");
                    break;
                }
            }
        }
        return result;
    }

    List<Integer> taskElevenReturnSum(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                list.add(numbers[i]);
            } else {
                list.add(list.get(counter) + numbers[i]);
                counter++;
            }
        }
        return list;
    }

    boolean taskTwelveIsRelativePrime(int number1, int number2) {
        for (int i = 1; i <= number1; i++) {
            if (number1 % i == 0 && number2 % i == 0 && i > 1) {
                return false;
            }
        }
        return true;
    }


    List taskThirteenFindMatthewKnight(String[][] arrays) {
        List<String> routes = new ArrayList<>();
        routes.add(arrays[0][0]);
        routes.add(arrays[0][1]);
        for (int i = 1; i <= arrays.length - 1; i++) {
            for (int j = 0; j <= 1; j++) {
                if (routes.get(routes.size() - 1).equals(arrays[i][j]) && j == 0) {
                    routes.add(arrays[i][j + 1]);
                    i = 0;
                    break;
                }
            }
        }
        return routes;
    }
}
