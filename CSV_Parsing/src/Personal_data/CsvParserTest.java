package Personal_data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CsvParserTest {
    DataValidator validator = new DataValidator();

    @Test
    void ParserTest() {
        Assertions.assertFalse(validator.isValid("192.168.0.1"));
        Assertions.assertFalse(validator.isValid("[Britney, 56, <script>alert(document.cookie)</script>]"));
        Assertions.assertFalse(validator.isValid("[Jonny, 96, <script>alert(ittenvanegytrojai.cookie)</script>]"));
        Assertions.assertTrue(validator.isValid("[Myrthill, 25, garbage-collector]"));
    }
}
