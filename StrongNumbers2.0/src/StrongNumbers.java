import java.util.Scanner;


public class StrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = getNumber(scanner);
        int digits = getStrongNumber(number);
        if (!isStrong(number, digits)) {
            System.out.println(number + " Is not a strong number");
        } else {
            System.out.println(number + " Is a strong number");
        }
    }

    static int getNumber(Scanner scanner) {
        System.out.println("Please give a number");
        int number = scanner.nextInt();
        return number;
    }

    static int getStrongNumber(int number) {
        int digit;
        int factorial = 1;
        int result = 0;
        while (number > 0) {
            digit = number % 10;
            number /= 10;
            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }
            result += factorial;
            factorial = 1;
        }
        return result;
    }

    static boolean isStrong(int inpunt, int result) {
        return (inpunt == result);
    }
}

