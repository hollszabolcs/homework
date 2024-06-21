package Second;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountWords {
    private static final ConsoleLogger logger = new ConsoleLogger();

    public static List<String> countWords() throws RuntimeException {
        FileExistenceValidator fileExistenceValidator = new FileExistenceValidator();
        List<String> words = new ArrayList<>();
        String path = GetFileName.userInput;
        if (!fileExistenceValidator.validate(path)) {
            logger.error("File doses not exist: " + path);
        }
        try {
            String text = Files.readAllLines(Paths.get(path)).toString();
            words = List.of(text.split(" "));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return words;
    }
}
