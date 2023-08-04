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
        if (number <= 5 || number == 7) {
            operands = getOperands(scanner);
        } else {
            operand = getOneoperand(scanner);
        }
        scanner.close();
        switch (number) {
            case 1:
                getSum(operands);
                break;
            case 2:
                getDif(operands);
                break;
            case 3:
                getMulti(operands);
                break;
            case 4:
                getDivision(operands);
                break;
            case 5:
                getModulardiv(operands);
                break;
            case 6:
                getPower(operand);
                break;
            case 7:
                getPercentage(operands);
                break;
            case 8:
                getFactorial(operand);
                break;
            case 9:
                getSquareroot(operand);
                break;
            default:

        }
    }

    private static int getNumber(Scanner scanner) {
        return scanner.nextInt();
    }


    private static int[] getOperands(Scanner scanner) {
        int i = 0;
        int[] operators = new int[2];
        System.out.println("Please type two numbers");
        for (int ops : operators) {
            operators[i] = scanner.nextInt();
            i++;
        }
        return operators;
    }

    private static int getOneoperand(Scanner scanner) {
        int operator = 0;
        System.out.println("Please type one number");
        operator = scanner.nextInt();
        return operator;
    }

     static int getSum(int[] numbers) {
        int result = 0;
        for (int operators : numbers) {
            result += operators;
        }
        System.out.println(result);
        return result;
    }

     static int getDif(int[] numbers) {
        int number1 = 0;
        int number2 = 0;
        int i = 0;
         for (int opeartos : numbers) {
             number1 = numbers[i];
             i++;
             number2 = numbers[i];
             break;
         }

         int result =number1- number2;
         System.out.println(result);
        return  result;
    }

     static int getMulti(int[] numbers) {
        int number1 = 0;
        int number2 = 0;
        int i = 0;
         for (int opeartos : numbers) {
             number1 = numbers[i];
             i++;
             number2 = numbers[i];
             break;
         }
         int result = number1 *  number2;
         System.out.println(result);
         return result;
     }

     static double getDivision(int[] numbers) {
        int number1 = 0;
        int number2 = 0;
         for (int i = 0; i <numbers.length;) {
            number1 = numbers[i];
            i++;
            number2 = numbers[i];
            break;
        }
        double result = number1 / number2;
        System.out.println(result);
        return result;
    }

     static double getModulardiv(int[] numbers) {
        int number1 = 0;
        int number2 = 0;
         for (int i = 0; i <numbers.length;) {
            number1 = numbers[i];
            i++;
            number2 = numbers[i];
            break;
        }
        double result =number1 % number2;
        System.out.println(result);
        return result;
    }

     static long getPower(int number) {
        double pownumber = Math.pow(number, 2);
        System.out.println((int) pownumber);
        return (long) pownumber;
    }

     static double getPercentage(int[] numbers) {
        double number1 = 0;
        double number2 = 0;
         for (int i = 0; i <numbers.length;) {
            number1 = numbers[i];
            i++;
            number2 = numbers[i];
            break;
        }
        double result = (number2/number1)*100;

        System.out.println(result);
        return result;
    }

    static long getFactorial(int num) {
        long factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
        return factorial;
    }

    static double getSquareroot(int num) {
        double squareroot = Math.sqrt(num);
        System.out.println(squareroot);
        return squareroot;
    }
}




