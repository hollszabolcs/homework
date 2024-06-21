package Second;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = 0;
        do {
            System.out.printf("Choose from the following:\n1:Text file load" +
                    "\n2:Count words in the file\n3:Count characters in the file" +
                    "\n4:Quit\n");
            try {
                cases = scanner.nextInt();
            } catch (Exception e) {
                throw new RuntimeException();
            }
            switch (cases) {
                case 1: {
                    GetFileName.getFileName();
                    break;
                }
                case 2: {
                    CountWords.countWords();
                    System.out.println("\nThe number of words in text is: " +CountWords.countWords().size());
                    System.out.println(CountWords.countWords()+ "\n");
                    break;
                }
                case 3: {
                    List<String> digitList=CountWords.countWords();
                    System.out.println("The file contains "+CountChar.countDigits(digitList)+" number of characters");
                    break;
                }
                case 4: {
                    System.out.println("Good bye!\nHave a nice Day!");
                    System.exit(0);
                }
                default:{
                    System.err.println("Invalid menu option");
                    break;
                }
            }
        } while (cases != 4);
    }
}
