package Time;

import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);
    String validatedTime;
    int hour;
    int minute;

    public void getError() {
        String time;
        boolean isValid = false;
        while (!isValid) {
            time = getTime();
            if (isValidFormat(time) && isValidTime(getHourComponents(time), getMinuteComponents(time))) {
                isValid = true;
                validatedTime = time;
            } else {
                System.err.println("Wrong format, please type again");
            }
        }
    }

    private String getTime() {
        System.out.println("Please enter a time(hh:mm)");
        String time = scanner.nextLine();
        return time;
    }

    int getHourComponents(String time) {
        String temp = time;
        return hour = Integer.valueOf(temp.substring(0, 2));
    }

    int getMinuteComponents(String time) {
        String temp = time;
        return minute = Integer.valueOf(temp.substring(3, 5));
    }

    boolean isValidFormat(String time) {
        return (time.matches("^(?:[01]?\\d|2[0-3])(?::[0-5]\\d){1,2}$"));
    }

    boolean isValidTime(int hour, int minute) {
        return (hour >= 0 && hour <= 23) && (minute >= 0 && minute <= 59);
    }
}
