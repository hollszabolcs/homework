package First;

import java.util.Collections;
import java.util.List;

public class GetMedian implements CalcStrategy {
    @Override
    public double calculate(List list) {
        Collections.sort(list);
        if (list.size() % 2 == 1) {
            return (double) list.get(list.size() / 2);
        } else {
            int middleOne = (int) list.get(list.size() / 2 - 1);
            int middleTwo = (int) list.get(list.size() / 2);
            return (middleOne + middleTwo) / 2.0;
        }
    }

    public GetMedian(List<Double> list) {
    }
}
