package Personal_data;

import java.util.ArrayList;
import java.util.List;

public class Persons {

    List<String> validatedData = new ArrayList<>();
    public String name;

    public String age;
    public String occupation;

    String getName() {
        char character = 0;
        otherLoop:
        for (String persons : validatedData) {
            for (int i = 0; i < persons.length(); i++) {
                character = persons.charAt(i);
                if (character == ',') {
                    name = persons.substring(1, i);
                    break otherLoop;
                }
            }
        }
        return name;
    }

    String getAge() {
        char character = 0;
        otherLoop:
        for (String persons : validatedData) {
            for (int i = 0; i < persons.length(); i++) {
                character = persons.charAt(i);
                if (character == ',') {
                    age = persons.substring(i + 2, i + 4);
                    break otherLoop;
                }
            }
        }
        return age;
    }

    String getOccupation() {
        char character = 0;
        int counter = 0;
        int tempCounter = 0;
        otherLoop:
        for (String persons : validatedData) {
            for (int i = 0; i < persons.length(); i++) {

                character = persons.charAt(i);
                if (character == ',') {
                    if (counter < 1) {
                        counter++;
                        continue;
                    }
                    while (character != ']') {
                        tempCounter++;
                        i++;
                        character = persons.charAt(i);
                    }
                    occupation = persons.substring(i - (tempCounter - 2), i);
                    break otherLoop;
                }

            }
        }
        return occupation;
    }

    @Override
    public String toString() {
        return "CsvCutter{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}

