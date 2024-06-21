package Second;

import java.util.List;

public class CountChar {
    private static final ConsoleLogger logger = new ConsoleLogger();

    public static int countDigits(List<String> words) throws RuntimeException {
        FileExistenceValidator fileExistenceValidator = new FileExistenceValidator();
        ;
        String path = GetFileName.userInput;
        int result = 0;
        if (!fileExistenceValidator.validate(path)) {
            logger.error("File doses not exist: " + path);
        }
        String wholeFile = words.toString();
        for (int i = 0; i < wholeFile.length(); i++) {
            char tempChar = wholeFile.charAt(i);
            if (tempChar == ' ' || tempChar == ',' || tempChar == '[' || tempChar == ']') {
                continue;
            }
            result++;
        }
        return result;
    }
}
