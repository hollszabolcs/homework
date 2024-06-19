package First;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetMode implements CalcStrategy {
    @Override
    public double calculate(List list) {
        Collections.sort(list);
        Map<Double, Double> numberMap = new HashMap<>();
        double counter=1.0;
        for (Object number: list) {
            if(numberMap.containsValue(number)){
                numberMap.put(numberMap.get(counter)+1, (Double) number);
            }else{
                counter=1.0;
                numberMap.put(counter, (Double) number);
            }

        }
        double maxKey = 0;
        for (Double key : numberMap.keySet()) {
            if ((maxKey == 0) || (key > maxKey)) {
                maxKey = key;
            }
        }
        return numberMap.get(maxKey);
    }

    public GetMode(List<Double> list ) {
    }
}
