import javax.swing.*;
import java.util.Scanner;

public class SquareNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plese write a number between 1-500");
        int numb = scanner.nextInt();
        int sum = 0;
        scanner.close();

        if (numb <= 500) {
            for (int i = 1; i <= numb; i++) {
                double squareNumb = Math.pow(i, 2);
                System.out.println(i + ".  square number: " + squareNumb);
                sum += squareNumb;
            }
            System.out.println("The sum of the square numbers are: " + sum);
        } else {
            System.err.println("The number is out of range");
        }

    }
}
