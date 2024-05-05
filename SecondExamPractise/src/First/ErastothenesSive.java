package First;

import java.util.HashSet;
import java.util.TreeSet;

public class ErastothenesSive {
    public static void main(String[] args) {
        TreeSet<Integer> primes = new TreeSet<>();
        primes = getSieve();
        System.out.println(primes);
    }

    public static TreeSet<Integer> getSieve() {
        TreeSet<Integer> getPrimes = new TreeSet<>();
        TreeSet<Integer> blacklist = new TreeSet<>();
        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i) && !blacklist.contains(i)) {
                getPrimes.add(i);
                for (int j = i; j <= 1000; j++) {
                    if (j % i == 0) {
                        blacklist.add(j);
                    }
                }
            }
        }
        return getPrimes;
    }

    public static boolean isPrime(int number) {
        if (number < 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
