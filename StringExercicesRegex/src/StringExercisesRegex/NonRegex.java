package StringExercisesRegex;

public class NonRegex {
    public static boolean isEAN13NonRegex(String text) {
        var counter = 0;
        int[] numberArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (var i = 0; i < text.length(); i++) {
            char eanChar = text.charAt(i);
            for (var j = 0; j <= numberArray.length; j++) {
                if (eanChar == numberArray[j] + '0') {
                    counter++;
                    break;
                }
                if (Character.isLetter(eanChar)) {
                    return false;
                }
            }
        }
        return counter == 13;
    }

    public static boolean isItalianPhoneNumberNonRegex(String text) {
        int[] numberArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String tempText = text.substring(0, 4);
        if (!tempText.equals("+393")) {
            return false;
        }
        var counter = 4;
        for (int i = 4; i < text.length(); i++) {
            char phoneChar = text.charAt(i);
            for (var j = 0; j <= numberArray.length; j++) {
                if (phoneChar == numberArray[j] + '0') {
                    counter++;
                    break;
                }
                if (Character.isLetter(phoneChar)) {
                    return false;
                }
            }
        }
        return counter == 13 || counter == 14;
    }

    public static boolean isHelloOrWorld(String text) {
        return text.equalsIgnoreCase("hello") || text.equalsIgnoreCase("world");
    }

    public static boolean isSpecialCharacter(String text) {
        var counter = 0;
        char specialChar;
        for (var i = 0; i <= 2; i++) {
            specialChar = text.charAt(i);
            if (!Character.isDigit(specialChar)) {
                counter++;
            }

        }
        for (var i = 3; i <= 4; i++) {
            specialChar = text.charAt(i);
            if (Character.isUpperCase(specialChar)) {
                counter++;
            }

        }
        for (var i = 5; i <= 6; i++) {
            specialChar = text.charAt(i);
            if (Character.isUpperCase(specialChar) || Character.isLowerCase(specialChar)) {
                counter++;
            }
        }
        specialChar = text.charAt(7);
        if (Character.isDigit(specialChar)) {
            counter++;
        }
        specialChar = text.charAt(9);
        if (specialChar > 0 || specialChar <= 5) {
            counter++;
        }
        counter = counter + 5;
        specialChar = text.charAt(text.length() - 1);
        if (specialChar == '.') {
            counter++;
        }
        return counter == 15;
    }
}