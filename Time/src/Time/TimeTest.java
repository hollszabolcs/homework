package Time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeTest {
    Output output = new Output();

    @Test
    void timeTest() {
        Assertions.assertEquals("It is a noon",output.covertToText(12,00));
        Assertions.assertEquals("It is midnight",output.covertToText(00,00));
        Assertions.assertEquals("It is ten o' clock",output.covertToText(10,00));
        Assertions.assertEquals("It is quarter past five",output.covertToText(17,15));
        Assertions.assertEquals("It is half past five",output.covertToText(17,30));
        Assertions.assertEquals("It is quarter to ten",output.covertToText(9,45));
        Assertions.assertEquals("It is ten to eight",output.covertToText(7,50));

    }

}
