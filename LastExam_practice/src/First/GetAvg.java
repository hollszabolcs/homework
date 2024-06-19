package First;

import java.util.List;

public class GetAvg implements CalcStrategy {

    @Override
    public double calculate(List list) {
        GetSum getSum = new GetSum();
        return (double) getSum.calculate(list) / list.size();
    }

    public GetAvg(List<Double> list) {
    }

}
