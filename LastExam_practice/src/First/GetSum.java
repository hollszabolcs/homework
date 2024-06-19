package First;

import java.util.List;

public class GetSum implements CalcStrategy {

    @Override
    public double calculate(List list) {
        int result = 0;
        for (Object numb : list) {
            result += (Double) numb;
        }
        return result;
    }

    public GetSum(List<Double> list) {
    }

    public GetSum() {
    }
}
