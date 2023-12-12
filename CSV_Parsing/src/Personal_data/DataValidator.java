package Personal_data;

public class DataValidator {

    boolean isValid(String data) {
        return data.matches("^[\\W]{1}[A-Za-z]+,+[\\D]+[0-9][0-9]{0,1}+,+[\\D]+[A-Za-z]+[\\W]$");
    }

}
