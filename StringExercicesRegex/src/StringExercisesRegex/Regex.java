package StringExercisesRegex;

public class Regex {
    public static boolean isEANRegex(String text) {
        return text.matches("[\\d]{13}");
    }

    public static boolean isItalianPhoneNumberRegex(String text) {
        return text.matches("\\+393\\d{8,9}$");
    }

    public static boolean isHelloOrWorldRegex(String text) {
        return text.matches("(?i)(hello|world)");
    }

    public static boolean isSpecialCharacterRegex(String text) {
        return text.matches("^[^0-9]{3}[A-Z]{2}[A-Za-z]{2}[0-9][1-5].{5}\\.$");
    }

}
