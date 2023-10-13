package StringExercisesRegex;

public class Main {
    public static void main(String[] args) {
        NonRegex nonRegex = new NonRegex();
        Regex regex = new Regex();
        boolean ean13 = nonRegex.callIsEAN13NonRegex("1234567890123");
        boolean ean13Regex = regex.callIsEANRegex("9876543210123");
        boolean italian = nonRegex.callIsItalianPhoneNumberNonRegex("+3933456784300");
        boolean italianRegex = regex.callIsItalianPhoneNumberRegex("+3933456784300");
        boolean helloWorld = nonRegex.callIsHelloOrWorld("hello");
        boolean helloWorldRegex = regex.callIsHelloOrWorldRegex("HeLlo");
        boolean specialCharacter = nonRegex.callIsSpecialCharacter("asdBBaB412541q12we.");
        boolean specialCharacterRegex = regex.callIsSpecialCharacter("asdBBaB412541q12we.");
        System.out.println("ean13 no regex: "+ean13);
        System.out.println("Italian phone num no regex: "+italian);
        System.out.println("helloWorld no regex: "+helloWorld);
        System.out.println("Special Character no regex: "+specialCharacter);
        System.out.println("ean13 regex: "+ean13Regex);
        System.out.println("Italian phone num regex: "+italianRegex);
        System.out.println("HelloWorld regex: "+helloWorldRegex);
        System.out.println("Special Character regex: "+specialCharacterRegex);
    }
}
