package First;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GetListOfNumbers extends First_Exam_Main {
    private static final Validator<Double> validator = new InputValidator();

    public static double getNumber(Scanner scanner) {
        double number = 0;
        try {
            number = scanner.nextInt();
            if (!validator.validate(number)) {
                System.err.println("Invalid number. Validation failed.");
                System.exit(0);
            }
        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please Use only numbers");
            System.exit(0);
        }
        return number;
    }

    static List<Double> getList(Scanner scanner) {
        List<Double> integerList = new ArrayList<>();
        double number = 0;

        System.out.println("Please enter numbers separate them with space, and when you want to end type '0' and press enter");
        do {
            number = getNumber(scanner);
            if (number != 0) {
                integerList.add(number);
            }
        } while (number != 0);

        return integerList;
    }
}

