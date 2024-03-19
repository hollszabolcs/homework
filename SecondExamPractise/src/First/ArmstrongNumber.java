package First;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a number");
        int number = scanner.nextInt();
        boolean armstrong = isArmstrong(number);
        if (!armstrong) {
            System.out.println("its not an armstrong number");
        } else {
            System.out.println("It is an Armstrong number");
        }
        getArmstrongBetweenOneTenThousand();
        getPrimesBetweenOneTenThousand();
        getQuotinent(getArmstrongBetweenOneTenThousand(),getPrimesBetweenOneTenThousand()   );
    }

    public static boolean isArmstrong(int number) {
        int temp = number;
        int numberLength = String.valueOf(number).length();
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numberLength);
            temp /= 10;
        }
        return sum == number;
    }

    public static int getArmstrongBetweenOneTenThousand() {
        long sum = 0;
        int primecounter = 0;
        for (int i = 1; i <= 10000; i++) {
            if (i >= 10 && i <= 99) {
                continue;
            }
            if (isArmstrong(i)) {
                sum += i;
            }
            if (isPrime(i)) {
                primecounter++;
            }
        }
        System.out.println("The number of Armstrong number between one & ten thousnad is: " + sum);
        return (int) sum;
    }


    public static int getPrimesBetweenOneTenThousand() {
        int counter = 0;
        for (int i = 1; i <= 10000; i++) {
            if (isPrime(i)) {
                counter++;
            }
        }
        System.out.println("There is " + counter + " number of primes beween 1 and 10000");
        return counter;
    }

    public static boolean isPrime(int number) {
        if (number < 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void getQuotinent(int number, int number2) {
         double number3=number/number2;

        System.out.println(number3);
    }

}

