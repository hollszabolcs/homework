package Personal_data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CsvParserTest {
    DataValidator validator = new DataValidator();

    @Test
    void ParserTest() {
        Assertions.assertEquals(false, validator.isValid("192.168.0.1"));
        Assertions.assertEquals(false, validator.isValid("[Britney, 56, <script>alert(document.cookie)</script>]"));
        Assertions.assertEquals(false, validator.isValid("[Jonny, 96, <script>alert(ittenvanegytrojai.cookie)</script>]"));
        Assertions.assertEquals(true, validator.isValid("[Myrthill, 25, garbage-collector]"));
    }
}
