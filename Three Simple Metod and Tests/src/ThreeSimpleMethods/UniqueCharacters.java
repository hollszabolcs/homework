package ThreeSimpleMethods;

public class UniqueCharacters {

    public boolean isUnique(String text) {
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            for (int j = i + 1; j < text.length(); j++) {
                char tempchar = text.charAt(j);
                if (character == tempchar) {
                    return false;
                }
            }
        }
        return true;
    }
}
