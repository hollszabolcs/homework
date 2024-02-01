package ThreeSimpleMethods;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public Map cutSentence(String text) {
        Map<Integer, String> word = new HashMap<>();
        int counter = -1;
        int wordId = 0;
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            counter++;
            if (character == ' ' || i == text.length() - 1) {
                wordId++;
                if (i == text.length() - 1) {
                    i++;
                    counter++;
                }
                String temp = text.substring(i - counter, i);
                word.put(wordId, temp);
                counter = -1;
            }
        }
        return word;
    }
}
