package First;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetListOfNumbers extends First_Exam_Main {

    static List<Double> getList(Scanner scanner) {
        List<Double> integerList = new ArrayList<>();
        double number;
        System.out.println("Please enter numbers separate them with space, and when you want to end type '0' and press enter");
        do {
            number = scanner.nextInt();
            if (number != 0) {
                integerList.add(number);
            }
        } while (number != 0);

        return  integerList;
    }
}

