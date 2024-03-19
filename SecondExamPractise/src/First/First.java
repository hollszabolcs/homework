package First;

public class First {
    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;
        for (int i = 16555; i > 2; i--) {
            if (isPrime(i)) {
                counter++;
            }
            if (isPrime(i) && counter <= 1) {
                System.out.println("The first prime is: " + i);
            }
            if (isPrime(i) && counter % 3 == 0) {
                System.out.printf(" %s", i);
            }
            if (i <= 7935 && i <= 4000) {
                sum = sum + i;
            }
            if (i <= 7935 && i <= 4000) {
                sum += i;
            }
        }
        System.out.printf("%n The sum of primes between 4000 and 7935 is: " + sum);
        if (isPrime(sum)) {
            System.out.println(" And it is a prime");
        } else {
            System.out.println(" And it is not a prime");
            getNextPrime(sum);
        }

    }

    static boolean isPrime(int number) {
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

    static void getNextPrime(int number) {
        int getprime = number;
        do {
            getprime++;
        } while (!isPrime(getprime));
        System.out.println("the next prime uppwards is " + getprime);
        getprime = number;
        do {
            getprime--;
        } while (!isPrime(getprime));
        System.out.println("the next prime downwards is " + getprime);
    }
}
