import java.util.Scanner;

public class SquareNumberLister {
    public static void main(String[] args) {
        System.out.println("Please give me a number");
        Scanner scanner = new Scanner(System.in);
        int number = GetNumberFromUser(scanner);
        SquareNumbers(number);
    }
     static int GetNumberFromUser(Scanner scanner) {
        int userNummber;
        boolean isValid;
        int counter = 0;
        do {
            userNummber = scanner.nextInt();
            isValid = isValid(userNummber);
            if (!isValid) {
                counter += 1;
            }
            if (counter ==5){
                System.err.println("Fatal errror");
            }
        } while (!isValid && counter != 5);
        return userNummber;
    }
     static boolean isValid(int number) {
        return number >= 2 && number <= 2_000_000_000;
    }
     static int SquareNumbers(int number) {
        int squareNumb = 1;
        for (int i = 1; i <= number; i++) {
            squareNumb = (int) Math.pow(i, 2);
            System.out.println(squareNumb);
        }
    return squareNumb;
    }
}


