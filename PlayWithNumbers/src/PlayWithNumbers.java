import java.util.Scanner;

public class PlayWithNumbers {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int number = getNumber(scanner);
        sum += number;
        System.out.println("The number:" + number);
        sum += getNumberDiv(number);
        sum += getFollowingPrime(number);
        sum += getPirceOfIceCream(number);
        sum += getVolumeOfCube(number);
        isCubicNumber(number);
        getEasterEgg(number);
        System.out.println(sum);
    }


    static boolean isValid(int number) {
        return number >= 1 && number <= 5_000;
    }


    static int getNumber(Scanner scanner) {
        int number;
        boolean isValid;
        int counter = 0;
        System.out.println("Please give a number between 1 and 5_000");
        do {
            number = scanner.nextInt();
            isValid = isValid(number);


            if (!isValid && counter <= 3) {
                System.out.println("That number is out of range, please give another");
                counter++;
            }
            if (counter == 5) {
                System.err.println("fatal error");
                break;
            }
            if (!isValid && counter > 3) {
                System.out.println("please read carefully the conditions");
                counter++;
            }


        } while (!isValid);
        return number;
    }


    static int getNumberDiv(int number) {
        int sum = 0;
        System.out.println("Divide numbers backwards:");
        for (int i = number; i > 0; i--) {
            if (number % i == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
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


    static int getFollowingPrime(int number) {
        int result = 0;
        if (isPrime(number)) {
            System.out.println("This number is prime");
        } else {
            System.out.println("This number is NOT prime");
            for (int i = number; i >= number; i++) {
                if (isPrime(i)) {
                    System.out.println(i + " Is is the smallest prime after " + number);
                    result = i;
                    break;
                }
            }
        }
        return result;
    }


    static int getPirceOfIceCream(int number) {
        int price = number * 275;
        System.out.println(number + " scoop of ice cream price is " + price + "Ft");
        return price;
    }


    static int getVolumeOfCube(int number) {
        int volumeofcube = (int) Math.pow(number, 3);
        System.out.println("A volume of the cube with " + number + " is " + volumeofcube);
        return volumeofcube;
    }


    static void isCubicNumber(int number) {
        if (number % Math.sqrt(number) == 0) {
            System.out.println("Its a cubic number");
        } else {
            System.out.println("Its not a cubic number");
        }
    }


    static void getEasterEgg(int number) {
        if (number == 4993) {
            System.out.println("BINGO");
        }
    }


}
