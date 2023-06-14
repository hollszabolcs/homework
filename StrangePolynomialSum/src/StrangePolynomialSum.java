import java.util.Scanner;

//todo Write an application that asks a number (n) from the user.
//todo        If the number is smaller than 1, exit the application
//todo        If it is not, calculate the result of the following operation:
//todo        11+22+33+44+51+62+73+84  +…+n?
//todo        The rules are as follows:
//todo        The exponent changes from 1 to 4 (a kitevő 1-től 4-ig változik)
//todo       The summation must go until n (az összeadásnak a user által megadott számig kell mennie).

public class StrangePolynomialSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, give me a number");
        double number = scanner.nextInt();
        int countSquareNumber = 1;
        int sumNumber = 0;
        int countNumber = 1;
        if (number < 1) {
            System.err.println("The number is smaller than 1");
        } else {
            for (int i = 1; i <= number; ++i) {
                double powNumb = Math.pow((double) i, countNumber);
                countNumber += 1;
                System.out.println(powNumb);
                sumNumber += powNumb;
                if (countNumber > 4) {
                    countNumber = 1;
                }
            }
            System.out.println("The amount of thes pow numbers are: " + sumNumber);
        }


    }
}
