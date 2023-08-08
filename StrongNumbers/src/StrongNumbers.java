import java.util.Scanner;

public class StrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a number between 1 and 9999");
        int number = getNumber(scanner);
        int firstFactor = getFirstFactor(number);
        int secondFactor = getSecondFactor(number);
        int thirdFactor = getThirdFactor(number);
        int fourthFator = getFourthFactor(number);
        int fifthFactor = getFifthFactor(number);
        int strongNumber = getStrongNumber(firstFactor, secondFactor, thirdFactor, fourthFator, fifthFactor);
        boolean iStrong = isStrongNumber(number, strongNumber);
        writeResult(iStrong);

    }

    static int getNumber(Scanner scanner) {
        int number = scanner.nextInt();
        return number;
    }

    static int getFirstFactor(int number) {
        int firstFactor = number / 10000;
        return firstFactor;
    }

    static int getSecondFactor(int number) {
        number %= 1000;
        int secondFactor = number / 1000;
        return secondFactor;
    }

    static int getThirdFactor(int number) {
        number %= 1000;
        int thirdFactor = number / 100;
        return thirdFactor;
    }

    static int getFourthFactor(int number) {
        number %= 100;
        int fourthFactor = number / 10;
        return fourthFactor;
    }

    static int getFifthFactor(int number) {
        number %= 10;
        int fifthFactor = number;
        return fifthFactor;
    }

    static int getStrongNumber(int firstFactor, int secondFactor, int thirdFactor, int fourthFactor, int fifthFactor) {
        int firsFactorresult = 0;
        int secondFactorresult = 0;
        int thirdFactorresult = 0;
        int fourthFactorresult = 0;
        int fifthFactorresult = 0;
        if (firstFactor >= 0) {
            firsFactorresult += 1;
            for (int i = firstFactor; i >= 1; i--) {
                firsFactorresult *= i;
            }
        }
        if (secondFactor >= 0) {
            secondFactorresult += 1;
            for (int i = secondFactor; i >= 1; i--) {
                secondFactorresult *= i;
            }
        }
        if (thirdFactor >= 0) {
            thirdFactorresult += 1;
            for (int i = thirdFactor; i >= 1; i--) {
                thirdFactorresult *= i;
            }
        }
        if (fourthFactor >= 0) {
            fourthFactorresult += 1;
            for (int i = fourthFactor; i >= 1; i--) {
                fourthFactorresult *= i;
            }
        }
        if (fifthFactor >= 0) {
            fifthFactorresult += 1;
            for (int i = fifthFactor; i >= 1; i--) {
                fifthFactorresult *= i;
            }
        }
        int finalresult = firsFactorresult + secondFactorresult + thirdFactorresult + fourthFactorresult + fifthFactorresult;
        return finalresult;
    }

    static boolean isStrongNumber(int number, int nummber2) {
        return number == nummber2;
    }

    static void writeResult(boolean isStrongNumber) {

        if (!isStrongNumber) {
            System.out.println("no strong numbers");
        } else {
            System.out.println("Strong numbers");
        }
    }
}



