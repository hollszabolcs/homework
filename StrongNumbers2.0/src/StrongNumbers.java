import java.util.Scanner;


public class StrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = getNumber(scanner);
        getResult(number);

    }

    static int getNumber(Scanner scanner) {
        System.out.println("Please give a number");
        int number = scanner.nextInt();
        return number;
    }

    static int getResult(int number) {
        int digit;
        int factorial = 1;
        int result = 0;
        int calculate = number;
        while (calculate > 0) {
            digit = calculate % 10;
            calculate /= 10;
            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }
            result += factorial;
            factorial = 1;
        }
        if (result == number) {
            System.out.println(number + " Is a Strong number");
        } else {
            System.out.println(number + " Is NOT a Strong number");

        }
        return result;
    }
}

