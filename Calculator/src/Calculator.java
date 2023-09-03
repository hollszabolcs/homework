import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("What do you wanna do: ");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.println("5 - Modular division");
        System.out.println("6 - Power");
        System.out.println("7 - Percentage");
        System.out.println("8 - Factorial");
        System.out.println("9 - Square root");
        Scanner scanner = new Scanner(System.in);
        int number = getNumber(scanner);
        int[] operands = new int[2];
        int operand = 0;
        if (number <= 7) {
            operands = getTwoOperands(scanner);
        } else {
            operand = getOneOperand(scanner);
        }
        scanner.close();
        switch (number) {
            case 1:
                System.out.println(getSum(operands));
                break;
            case 2:
                System.out.println(getDif(operands));
                break;
            case 3:
                System.out.println(getMulti(operands));
                break;
            case 4:
                System.out.println(getDivision(operands));
                break;
            case 5:
                System.out.println(getModularDiv(operands));
                break;
            case 6:
                System.out.println(getPower(operands));
                break;
            case 7:
                System.out.println(getPercentage(operands));
                break;
            case 8:
                System.out.println(getFactorial(operand));
                break;
            case 9:
                System.out.println(getSquareRoot(operand));
                break;

        }
    }

    private static int getNumber(Scanner scanner) {
        return scanner.nextInt();
    }

    private static int[] getTwoOperands(Scanner scanner) {
        int[] operands = new int[2];
        System.out.println("Please type two numbers");
        for (int i = 0; i < operands.length; i++ ) {
            operands[i] = scanner.nextInt();
        }
        return operands;
    }

    private static int getOneOperand(Scanner scanner) {
        int operand = 0;
        System.out.println("Please type one number");
        operand = scanner.nextInt();
        return operand;
    }

    static int getSum(int[] numbers) {
        int result = 0;
        for (int values : numbers) {
            result += values;
        }
        return result;
    }

    static int getDif(int[] numbers) {
        int number1 = numbers[0];
        int number2 = numbers[1];
        int result = number1 - number2;
        return result;
    }

    static double getMulti(int[] numbers) {
        double number1 = numbers[0];
        double number2 = numbers[1];
        double result = number1 * number2;
        return result;
    }

    static double getDivision(int[] numbers) {
        double number1 = numbers[0];
        double number2 = numbers[1];
        double result = number1 / number2;
        return result;
    }

    static double getModularDiv(int[] numbers) {
        double number1 = numbers[0];
        double number2 = numbers[1];
        double result = number1 % number2;
        return result;
    }

    static long getPower(int[] numbers) {
        double number = numbers[0];
        double pow = numbers[1];
        double powNumber = Math.pow(number, pow);
        return (long) powNumber;
    }

    static double getPercentage(int[] numbers) {
        double number1 = numbers[0];
        double number2 = numbers[1];
        double result = (number2 / (number1 / 100));
        return result;
    }

    static long getFactorial(int num) {
        long factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    static double getSquareRoot(int num) {
        double square = Math.sqrt(num);
        return square;
    }
}




