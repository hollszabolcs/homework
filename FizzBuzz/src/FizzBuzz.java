import java.util.Scanner;

/*
Write a short program that asks a number from the user. If the user
        enters an invalid number (smaller than 1), keep asking the number until the user enters a
        valid input.
        If the input is valid, print all the number from 1 to that number to the console.
        For each multiple of 3, print "Fizz" instead of the number.
        For each multiple of 5, print "Buzz" instead of the number.
        For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.
*/
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a number");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.err.println("The number is smaller than 1, or its not a number");
        }
        int number = scanner.nextInt();
        while (number < 1) {
            System.err.println("The number is smaller than 1, or its not a number");
            int numberCheck = scanner.nextInt();
            number = numberCheck;
        }
        for (int i = 1; i <= number; ++i) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

