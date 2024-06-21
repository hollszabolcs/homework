package First;

public class InputValidator implements Validator<Double> {
    @Override
    public boolean validate(Double input) {
        return input != null && !Double.isNaN(input) && Double.isFinite(input) && input<0;

    }
}