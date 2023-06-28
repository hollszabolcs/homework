import java.util.Scanner;

public class HolyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a number");
        int number = scanner.nextInt();
        scanner.close();
        if (number < 100 && number % 7 != 0 && number % 2 == 0) {
            System.out.println("A(z) " + number + " Mennyei szám");
        } else if (number > 300 && number % 13 == 0) {
            int counter = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    counter += 1;
                }
                if (counter > 8) {
                    System.out.println("A(z) " + number + " Mennyei szám");
                    break;
                } else {
                    System.out.println("A(z) " + number + " NEM Mennyei szám");
                    break;
                }
            }
        } else {
            System.out.println("A(z) " + number + " NEM Mennyei szám");
        }
    }
}

