package Personal_data;

import java.util.ArrayList;
import java.util.List;

public class CsvDataCleaner {

    List<String> cleanValidData = new ArrayList<>();

    String getCleanData(String text) {
        char[] removableCharacters = {'[', ']', ','};
        StringBuilder cleanData = new StringBuilder();
        for (char character : text.toCharArray()) {
            boolean isRemovable = false;
            for (char removableChar : removableCharacters) {
                if (character == removableChar) {
                    isRemovable = true;
                    break;
                }
            }
            if (!isRemovable) {
                cleanData.append(character);
            }
        }
        String result = String.valueOf(cleanData);
        cleanValidData.add(result);
        return result;
    }

}

