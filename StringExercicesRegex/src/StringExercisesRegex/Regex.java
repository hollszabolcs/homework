package StringExercisesRegex;

public class Regex {

    public static boolean callIsEANRegex(String text) {
        return isEANRegex(text);
    }

    public static boolean callIsItalianPhoneNumberRegex(String text) {
        return isItalianPhoneNumberRegex(text);
    }

    public static boolean callIsHelloOrWorldRegex(String text) {
        return isHelloOrWorldRegex(text);
    }

    public static boolean callIsSpecialCharacter(String text) {
        return isSpecialCharacterRegex(text);
    }

    private static boolean isEANRegex(String text) {
        return text.matches("[0-9]{13}");
    }

    private static boolean isItalianPhoneNumberRegex(String text) {
        return text.matches("\\+393\\d{9,10}$");
    }

    private static boolean isHelloOrWorldRegex(String text) {
        return text.matches("(?i)(hello|world)");
    }

    private static boolean isSpecialCharacterRegex(String text) {
        return text.matches("[^0-9]{3}[A-Z]{2}[A-Za-z]{2}\\d[1-5]{5}[A-Za-z0-9]{5}\\.");
    }

}
