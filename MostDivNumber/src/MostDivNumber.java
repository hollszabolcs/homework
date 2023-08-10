import java.util.Scanner;


public class MostDivNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a number");
        int number = scanner.nextInt();
        isValid(number);
        getMostDiv(number);

    }

    public static boolean isValid(int number) {
        if (number < 2 || number > 100000) {
            System.err.println("Fatal error");
            return false;
        } else {
            return true;
        }
    }

    public static void getMostDiv(int number) {
        int nzmbrOfDivisors = 0;
        int counDivisors = 0;
        int temp1 = 0;
        int numberofmostdivisors = 0;
        for (int i = 3; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    counDivisors++;
                }
            }
            if (nzmbrOfDivisors < counDivisors) {
                numberofmostdivisors = i;
                System.out.println(i);
                nzmbrOfDivisors = counDivisors;
            }
            counDivisors = 0;
        }
        System.out.println(numberofmostdivisors + " Has the most div: " + nzmbrOfDivisors);
    }
}



