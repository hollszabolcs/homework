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
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
            } else {
                map.put(character, 1);
            }
        }
        for (int i = 0; i < text2.length(); i++) {
            char character = text2.charAt(i);
            if (map2.containsKey(character)) {
                map2.put(character, map2.get(character) + 1);
            } else {
                map2.put(character, 1);
            }
        }
        return map.equals(map2);
    }

    int taskFourCountNumbers(String text) {
        int result = 0;
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (Character.isDigit(character)) {
                result += Character.getNumericValue(character);
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

    String taskSixGetUniqueChar(String text) {
        Map<Integer, Character> map = new HashMap<>();
        int key = 0;
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (map.containsValue(character)) {
                map.put(key + 1, character);
            } else {
                map.put(key + 1, character);
            }
        }
        return map.toString();
    }

    StringBuilder taskSevenGetAllUniqueChar(String text) {
        StringBuilder result = new StringBuilder();
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
                result.append((character));
            } else {
                blacklist.add(character);
                counter = 0;
            }
        }
        return result;
    }

    boolean taskEightSameAmountOfAb(String text, String text2) {
        return (taskEightMethod('a', text) == taskEightMethod('a', text2))
                && taskEightMethod('b', text) == taskEightMethod('b', text2);
    }

    private int taskEightMethod(char getChar, String text) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (character == getChar) {
                counter++;
            }
        }
        return counter;
    }

    boolean taskNineArrayContains(int[] numbers, int number) {
        Arrays.sort(numbers);
        for (int numb : numbers) {
            if (number == numb) {
                return true;
            }
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

    boolean taskTwelveIsPrime(int number1, int number2) {
        return taskTwelveMethod(number1) && taskTwelveMethod(number2);
    }

    private boolean taskTwelveMethod(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    List taskThirteenFindMatthewKnight(String[][] arrays) {
        List<String> routes = new ArrayList<>();
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j <= 1; j++) {
                if (i == 0 && (j == 0 || j == 1)) {
                    routes.add(arrays[i][j]);
                }
                if (arrays[i][0].equals("BRA")) {
                    routes.add(arrays[i][1]);
                    break;
                }
            }
        }
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j <= 1; j++) {
                if (!arrays[i][0].equals("USA") && !arrays[i][0].equals("BRA") && !arrays[i][0].equals("UAE")) {
                    routes.add(arrays[i][0]);
                    routes.add(arrays[i][1]);
                    break;
                }
            }
        }
        return routes;
    }
}
