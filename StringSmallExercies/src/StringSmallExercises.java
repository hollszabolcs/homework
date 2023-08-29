import java.util.Scanner;

public class StringSmallExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = getText(scanner);
        int countofb = getBLetters(text);
        getNumberOfB(countofb);
        int countofhellos = getHellos(text);
        getNumberOfHellos(countofhellos);
    }

    public static String getText(Scanner scanner) {
        System.out.println("Please give me a text");
        String text = scanner.nextLine();
        return text;
    }

    public static int getBLetters(String text) {
        char letters = 0;
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            letters = text.charAt(i);
            if (letters == 'b' || letters == 'B') {
                counter++;
            }
        }
        return counter;
    }

    public static void getNumberOfB(int numbers) {
        System.out.println("There is " + numbers + " 'b' in this text");
    }

    public static int getHellos(String text) {
        char letter = 0;
        String temporarytext = "";
        int conunter = 0;
        for (int i = 0; i < text.length(); i++) {
            letter = text.charAt(i);
            if (letter == 'H' || letter == 'h') {
                temporarytext = text.substring(i,i+5);
                if (temporarytext.contains("hello") || temporarytext.contains("Hello")) {
                    conunter += 1;
                }
            }
        }
        return conunter;
    }

    public static void getNumberOfHellos(int numbers) {
        System.out.println("There is " + numbers + " 'hello' in this text");
    }
}

