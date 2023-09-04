import java.util.Scanner;

public class StringSmallExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = getText(scanner);
        int countofb = getAmountOfB(text);
        printNumberOfBs(countofb);
        int countofhellos = getHellos(text);
        printNumberOfHello(countofhellos);
    }

    public static String getText(Scanner scanner) {
        System.out.println("Please give me a text");
        String text = scanner.nextLine();
        return text;
    }

    public static int getAmountOfB(String text) {
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

    public static int getHellos(String text) {
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

    public static void printNumberOfHello(int numbers) {
        System.out.println("There is " + numbers + " 'hello' in this text");
    }
}

