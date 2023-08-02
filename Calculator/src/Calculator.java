import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        getText();
        Scanner scanner = new Scanner(System.in);
        int number = getNumber(scanner);
        int[] operators = new int[2];
        int operator = 0;
        if (number < 5 || number == 7) {
            operators = getOperators(scanner);
        } else {
            operator = getOneoperator(scanner);
        }
        switch (number) {
            case 1:
                getSum(operators);
                break;
            case 2:
                getDif(operators);
                break;
            case 3:
                getMulti(operators);
                break;
            case 4:
                getDivision(operators);
                break;
            case 5:
                getModulardiv(operators);
                break;
            case 6:
                getPower(operator);
                break;
            case 7:
                getPercentage(operators);
                break;
            case 8:
                getFactorial(operator);
                break;
            case 9:
                getSquareroot(operator);
                break;
            default:

        }
        scanner.close();
    }

    private static int getNumber(Scanner scanner) {
        return scanner.nextInt();
    }


    private static int[] getOperators(Scanner scanner) {
        int i = 0;
        int[] operators = new int[2];
        System.out.println("Please type two numbers");
        for (int ops : operators) {
            operators[i] = scanner.nextInt();
            i++;
        }
        scanner.close();
        return operators;
    }

    private static int getOneoperator(Scanner scanner) {
        int operator = 0;
        System.out.println("Please type one number");
        operator = scanner.nextInt();
        scanner.close();
        return operator;
    }

     static void getSum(int[] numbers) {
        int result = 0;
        for (int operators : numbers) {
            result += operators;
        }
        System.out.println(result);
    }

     static void getDif(int[] numbers) {
        int number1 = 0;
        int number2 = 0;
        int i = 0;
        for (int opeartos : numbers) {
            number1 = numbers[i];
            i++;
            number2 = numbers[i];
            break;
        }
        System.out.println(number1 - number2);
    }

     static void getMulti(int[] numbers) {
        int number1 = 0;
        int number2 = 0;
        int i = 0;
        for (int opeartos : numbers) {
            number1 = numbers[i];
            i++;
            number2 = numbers[i];
            break;
        }
        System.out.println(number1 * number2);
    }

     static void getDivision(int[] numbers) {
        int number1 = 0;
        int number2 = 0;
        int i = 0;
        for (int opeartos : numbers) {
            number1 = numbers[i];
            i++;
            number2 = numbers[i];
            break;
        }
        System.out.println(number1 / number2);
    }

     static void getModulardiv(int[] numbers) {
        int number1 = 0;
        int number2 = 0;
        int i = 0;
        for (int opeartos : numbers) {
            number1 = numbers[i];
            i++;
            number2 = numbers[i];
            break;
        }
        System.out.println(number1 % number2);
    }

     static void getPower(int number) {
        double pownumber = Math.pow(number, 2);
        System.out.println((int) pownumber);
    }

     static void getPercentage(int[] numbers) {
        int number1 = 0;
        int number2 = 0;
        int i = 0;
        for (int opeartos : numbers) {
            number1 = numbers[i];
            i++;
            number2 = numbers[i];
            break;
        }
        System.out.println(((double) number2 / number1) * 100);
    }

    static void getFactorial(int num) {
        long factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }

    static void getSquareroot(int num) {
        double squareroot = Math.sqrt(num);
        System.out.println(squareroot);
    }

    private static void getText() {
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
    }

}






