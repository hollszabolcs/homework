import java.util.Scanner;

public class StringSmallExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = getText(scanner);
        int bCount = getBCharacterCount(text);
        printNumberOfBs(bCount);
        int helloCount = getHelloCount(text);
        printNumberOfHellos(helloCount);
    }

    public static String getText(Scanner scanner) {
        System.out.println("Please give me a text");
        String text = scanner.nextLine();
        return text;
    }

    public static int getBCharacterCount(String text) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (character == 'B') {
                counter++;
            }
        }
        return counter;
    }

    public static void printNumberOfBs(int numbers) {
            System.out.println("There is " + numbers + " 'b' in this text");
    }

    public static int getHelloCount(String text) {
        char character = 0;
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            character = text.charAt(i);
            if (character == 'h') {
                String temporarytext = text.substring(i, i + 5);
                if (temporarytext.contains("hello")) {
                    counter += 1;
                }
            }
        }
        return counter;
    }

    public static void printNumberOfHellos(int numbers) {
        System.out.println("There is " + numbers + " 'hello' in this text");
    }
}

