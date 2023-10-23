package StringExercisesRegex;

public class Main {
    public static void main(String[] args) {
        boolean ean13 = NonRegex.isEAN13NonRegex("123567890123");
        boolean ean13Regex = Regex.isEANRegex("9876543210123");
        boolean italian = NonRegex.isItalianPhoneNumberNonRegex("+393456784300");
        boolean italianRegex = Regex.isItalianPhoneNumberRegex("+393345678430");
        boolean helloWorld = NonRegex.isHelloOrWorld("hello");
        boolean helloWorldRegex = Regex.isHelloOrWorldRegex("HeLlo");
        boolean specialCharacter = NonRegex.isSpecialCharacter("asdBBaB41q?2we.");
        boolean specialCharacterRegex = Regex.isSpecialCharacterRegex("asdBBaB41q?2we.");
        System.out.println("ean13 no regex: " + ean13);
        System.out.println("Italian phone num no regex: " + italian);
        System.out.println("helloWorld no regex: " + helloWorld);
        System.out.println("Special Character no regex: " + specialCharacter);
        System.out.println("ean13 regex: " + ean13Regex);
        System.out.println("Italian phone num regex: " + italianRegex);
        System.out.println("HelloWorld regex: " + helloWorldRegex);
        System.out.println("Special Character regex: " + specialCharacterRegex);
    }
}
