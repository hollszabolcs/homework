package Second;

import java.util.Scanner;

public class GetFileName {
    static String userInput;

    static void getFileName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the file name what you want to read(currently:<Filename>)");
        String getUserInput = scanner.nextLine();
        System.err.println("currently read:<" + getUserInput + ">");
        if(getUserInput.equals(null)||getUserInput.equals("")||getUserInput.equals(" ")){
            getUserInput=null;
        }
        String hardcodedPath = "C:/";
        userInput =hardcodedPath+getUserInput;
    }
}

