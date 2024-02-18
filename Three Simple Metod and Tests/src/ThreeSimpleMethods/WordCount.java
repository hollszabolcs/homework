package ThreeSimpleMethods;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class WordCount {
    public Map cutSentence(String text) {
        Map<String, Integer> word = new HashMap<>();
        text = text.toLowerCase();
        String[] getWords = text.split(" ");
        for (String oneWord : getWords) {
            if (!word.containsKey(oneWord)) {
                word.put(oneWord, 1);
            } else {
                int frequency = word.get(oneWord);
                word.put(oneWord, frequency + 1);
            }
        }
        return word;
    }
}
