package First;

import java.util.List;
import java.util.Scanner;

public class First_Exam_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> list = GetListOfNumbers.getList(scanner);
        System.out.println("please choose one of them:1:SUM 2:AVG");
        int cases = scanner.nextInt();
        switch (cases) {
            case 1 -> {
                GetSum getSum = new GetSum(list);
                System.out.println(getSum.calculate(list));
            }
            case 2 -> {
                GetAvg getAvg = new GetAvg(list);
                System.out.println(getAvg.calculate(list));
            }
            case 3 -> {
                GetMedian getMedian = new GetMedian(list);
                System.out.println(getMedian.calculate(list));
            }
        }
    }
}
