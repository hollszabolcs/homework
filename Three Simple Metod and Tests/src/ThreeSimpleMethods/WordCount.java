package ThreeSimpleMethods;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public Map cutSentencedemo(String text) {
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
                for (String words : word.values()) {
                    if (words.equals(text)) {
                        wordId++;
                    } else {
                        word.put(wordId, temp);

                    }
                }
                counter = -1;
            }
        }
        return word;
    }

    public Map cutSentence(String text) {
        Map<String, Integer> word = new HashMap<>();
        int counter = -1;
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            counter++;
            if (character == ' ' || i == text.length() - 1) {
                if (i == text.length() - 1) {
                    i++;
                    counter++;
                }
                String temp = text.substring(i - counter, i).toLowerCase();
                if (!word.containsKey(temp)) {
                    word.put(temp, 1);
                } else {
                    int frequency = word.get(temp);
                    word.put(temp, frequency + 1);
                }
                counter = -1;
            }

        }
        return word;
    }
}
