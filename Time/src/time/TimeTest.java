package time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeTest {
    TimeConverter output = new TimeConverter();

    @Test
    void timeTest() {
        Assertions.assertEquals("It is a noon",output.convertToText(12,00));
        Assertions.assertEquals("It is midnight",output.convertToText(00,00));
        Assertions.assertEquals("It is ten o' clock",output.convertToText(10,00));
        Assertions.assertEquals("It is quarter past five",output.convertToText(17,15));
        Assertions.assertEquals("It is half past five",output.convertToText(17,30));
        Assertions.assertEquals("It is quarter to ten",output.convertToText(9,45));
        Assertions.assertEquals("It is ten to eight",output.convertToText(7,50));

    }

}
