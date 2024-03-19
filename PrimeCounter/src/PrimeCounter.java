//Elso feladat
public class PrimeCounter {

    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i <= 10; i++) {
            if (isPrime(i) == true) {
                counter += 1;
                System.out.println(i);
            }
        }
        System.out.println("there is " + counter + " prime number");
    }


    static boolean isPrime(int number) {
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


