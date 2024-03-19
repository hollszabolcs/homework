package ThreeSimpleMethods;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {

    public boolean isUnique(String text) {
        Set<Character> uniqueLetters = new HashSet<>();
        for (char character : text.toCharArray()) {
            if (!uniqueLetters.add(character)) {
                return false;
            }
        }
        return true;
    }
}

