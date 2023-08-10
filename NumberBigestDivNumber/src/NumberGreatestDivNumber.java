import java.util.Scanner;

public class NumberGreatestDivNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a number");
        int number = scanner.nextInt();
        isValid(number);
        int getDiv = getGreatestDiv(number);
        getDivPrime(getDiv);
        getSmallestPrimeUp(getDiv);
        getGreatestPrimeDown(getDiv);
    }
    
    public static boolean isValid(int number) {
        return 2 <= number;
    }


    public static int getGreatestDiv(int number) {
        int temp = 0;
        for (int i = 2; i < number; i++) {
            for (int j = 1; j < number; j++) {
                if (i % j == 0 && number % i == 0) {
                    temp = i;
                }
            }
        }
        return temp;
    }


    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void getDivPrime(int number) {
        int result = 0;


        if (isPrime(number)) {
            result = number;
            System.out.println(result);
        }
        if (!isPrime(number)) {
            System.out.println("no primes");
        }
    }


    public static void getSmallestPrimeUp(int number) {
        int temp = number;
        do {
            if (!isPrime(temp)) {
                temp++;
            }
        }
        while (!isPrime(temp));
        System.out.println("Starting form the greatest divisor the smallest prime number to upwards: " + temp);
    }

    public static void getGreatestPrimeDown(int number) {
        int temp = number;
        do {
            if (!isPrime(temp)) {
                temp--;
            }
        }
        while (!isPrime(temp));
        System.out.println("Starting form the greatest divisor the greatest prime number to backwards: " + temp);
    }
}





