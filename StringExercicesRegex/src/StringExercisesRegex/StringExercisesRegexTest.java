package StringExercisesRegex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringExercisesRegexTest {

    @Test
    void testStringExercisesRegex() {
        Assertions.assertEquals(true, NonRegex.isEAN13NonRegex("1234567890123"));
        Assertions.assertEquals(false, NonRegex.isEAN13NonRegex("12sf567890123"));
        Assertions.assertEquals(true, NonRegex.isItalianPhoneNumberNonRegex("+393345678430"));
        Assertions.assertEquals(false, NonRegex.isItalianPhoneNumberNonRegex("+3133456784300"));
        Assertions.assertEquals(false, NonRegex.isItalianPhoneNumberNonRegex("+3933456784"));
        Assertions.assertEquals(false, NonRegex.isItalianPhoneNumberNonRegex("+39334567841111"));
        Assertions.assertEquals(true, NonRegex.isHelloOrWorld("hello"));
        Assertions.assertEquals(true, NonRegex.isHelloOrWorld("WoRlD"));
        Assertions.assertEquals(false, NonRegex.isHelloOrWorld("Sanyi"));
        Assertions.assertEquals(true, NonRegex.isSpecialCharacter("asdBBaB41q?2we."));
        Assertions.assertEquals(false, NonRegex.isSpecialCharacter("asdBdaB41q?2we."));
        Assertions.assertEquals(false, NonRegex.isSpecialCharacter("asdBdaB41q?2we......df"));
        Assertions.assertEquals(true, Regex.isEANRegex("1234567890123"));
        Assertions.assertEquals(false, Regex.isEANRegex("12sf567890123"));
        Assertions.assertEquals(true, Regex.isItalianPhoneNumberRegex("+393345678430"));
        Assertions.assertEquals(false, Regex.isItalianPhoneNumberRegex("+3933456784"));
        Assertions.assertEquals(false, Regex.isItalianPhoneNumberRegex("+3933456784"));
        Assertions.assertEquals(false, Regex.isItalianPhoneNumberRegex("+39334567841111"));
        Assertions.assertEquals(true, Regex.isHelloOrWorldRegex("hello"));
        Assertions.assertEquals(true, Regex.isHelloOrWorldRegex("WoRlD"));
        Assertions.assertEquals(false, Regex.isHelloOrWorldRegex("Sanyi"));
        Assertions.assertEquals(true, Regex.isSpecialCharacterRegex("asdBBaB45q?2we."));
        Assertions.assertEquals(false, Regex.isSpecialCharacterRegex("asdBdaB41q?2we."));
        Assertions.assertEquals(false, Regex.isSpecialCharacterRegex("asdBdaB41q?2we......df"));


    }
}
