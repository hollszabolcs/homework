import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        firstMethod("MaMa", 3);
        secondMethod(scanner);
        thirdMethod(scanner);
    }

    public static void firstMethod(String text, int number) {
        String empty = null;
        if (text.matches("^[A-Za-z]+$")) {
            for (int i = 0; i < text.length(); i++) {
                char character = text.charAt(i);
                for (int j = 0; j < number; j++) {
                    System.out.print(character);
                }
            }
            System.out.println("");
        } else {
            System.out.println(empty);
        }
    }

    public static void secondMethod(Scanner scanner) {
        String[] sentence = new String[4];
        System.out.println("please get 4 sentences");
        for (int i = 0; i < sentence.length; i++) {
            sentence[i] = scanner.nextLine();
            if (sentence[i].length() >= 15) {
                System.out.println("BINGO");
            }
        }
        for (int i = sentence.length - 1; i >= 0; i--) {
            System.out.println(sentence[i]);
        }
    }

    public static void thirdMethod(Scanner scanner) {
        System.out.println("Please give a sentence");
        String text = scanner.nextLine();
        String[] words = text.split(" ");
        List<String> badWords = new ArrayList<>();
        for (String part : words) {
            if (part.matches("^[a-z,áéőöüúű]+$")) {
                System.out.println(part);
            } else {
                badWords.add(part);
            }
        }
        System.out.println("The following words do not match:" + badWords);

    }
}