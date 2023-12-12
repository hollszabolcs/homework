package Personal_data;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        DataValidator validator = new DataValidator();
        CsvParser parser = new CsvParser("c:/people-and-occupations.csv", CsvSeparator.SEMICOLON);
        var personalData = parser.parse();
        List<String> validatedData = new ArrayList<>();
        List<String> maliciousCode = new ArrayList<>();
        for (List<String> data : personalData) {
            if (validator.isValid(data.toString())) {
                validatedData.add(data.toString());
            } else {
                maliciousCode.add(data.toString());
            }
        }
        System.out.println("Validated data");
        for (String list : validatedData) {
            System.out.println(list);
        }
        System.out.printf("%nMalicious code%n");
        for (String list : maliciousCode) {
            System.out.println(list);
        }
    }

}
