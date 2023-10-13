package StringExercisesRegex;

public class NonRegex {


    public static boolean callIsEAN13NonRegex(String text) {
        return isEAN13NonRegex(text);
    }

    public static boolean callIsItalianPhoneNumberNonRegex(String text) {
        return isItalianPhoneNumberNonRegex(text);
    }

    public static boolean callIsHelloOrWorld(String text) {
        return isHelloOrWorld(text);
    }

    public static boolean callIsSpecialCharacter(String text) {
        return isSpecialCharacter(text);
    }

    private static boolean isEAN13NonRegex(String text) {
        var counter = 0;
        int[] numberArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (var i = 0; i < text.length(); i++) {
            char eanChar = text.charAt(i);
            for (var j = 0; j <= numberArray.length; j++) {
                if (eanChar == numberArray[j] + '0') {
                    counter++;
                    break;
                }
            }
        }
        return counter == 13;
    }

    private static boolean isItalianPhoneNumberNonRegex(String text) {
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
            }
        }
        return counter == 13 || counter == 14;
    }

    private static boolean isHelloOrWorld(String text) {
        return text.equalsIgnoreCase("hello") || text.equalsIgnoreCase("world");
    }

    private static boolean isSpecialCharacter(String text) {
        int[] numbArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        char[] upperArray = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        var counter = 0;
        char specialChar;
        for (var i = 0; i <= 2; i++) {
            specialChar = text.charAt(i);
            for (var j = 0; j <= numbArray.length; j++) {
                if (specialChar != numbArray[j] + '0') {
                    counter++;
                    break;
                }
            }
        }
        for (var i = 3; i <= 4; i++) {
            specialChar = text.charAt(i);
            for (var j = 0; j <= upperArray.length; j++) {
                if (specialChar == upperArray[j]) {
                    counter++;
                    break;
                }
            }
        }
        for (var i = 5; i <= 6; i++) {
            specialChar = text.charAt(i);
            if (Character.isUpperCase(specialChar) || Character.isLowerCase(specialChar)) {
                counter++;
            }
        }
        specialChar = text.charAt(7);
        for (var i = 0; i <= numbArray.length; i++) {
            if (specialChar == numbArray[i] + '0') {
                counter++;
                break;
            }
        }
        for (var i = 8; i <= 12; i++) {
            specialChar = text.charAt(i);
            for (var j = 1; j <= 5; j++) {
                if (specialChar == numbArray[j] + '0') {
                    counter++;
                    break;
                }
            }
        }
        counter += 5;
        specialChar = text.charAt(text.length() - 1);
        if (specialChar == '.') {
            counter++;
        }
        return counter == 19;
    }
}