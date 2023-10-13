package StringExercisesRegex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringExercisesRegexTest {

    @Test
    void testStringExercisesRegex(){
        Assertions.assertEquals(true, NonRegex.callIsEAN13NonRegex("1234567890123"));
        Assertions.assertEquals(true, NonRegex.callIsItalianPhoneNumberNonRegex("+3933456784300"));
        Assertions.assertEquals(true, NonRegex.callIsHelloOrWorld("hellcdo"));
        Assertions.assertEquals(true, NonRegex.callIsSpecialCharacter("asdBBaB412541q12we."));
        Assertions.assertEquals(true, Regex.callIsEANRegex("1234567890123"));
        Assertions.assertEquals(true, Regex.callIsItalianPhoneNumberRegex("+3933456784300"));
        Assertions.assertEquals(true, Regex.callIsHelloOrWorldRegex("WoRlD"));
        Assertions.assertEquals(true, Regex.callIsSpecialCharacter("asdBBaB412541q12we."));



    }
}
