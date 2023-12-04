package time;

import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);
    String validatedTime;
    private int hour;
    private int minute;

    void printError() {
        String time;
        boolean isValid = false;
        while (!isValid) {
            time = getTime();
            if (isFormatValid(time) && isValidTime(getHourComponents(time), getMinuteComponents(time))) {
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

    private int getHourComponents(String time) {
        String temp = time;
        return hour = Integer.valueOf(temp.substring(0, 2));
    }

    private int getMinuteComponents(String time) {
        String temp = time;
        return minute = Integer.valueOf(temp.substring(3, 5));
    }

    private boolean isFormatValid(String time) {
        return (time.matches("^(?:[01]?\\d|2[0-3])(?::[0-5]\\d){1,2}$"));
    }

    private boolean isValidTime(int hour, int minute) {
        return (hour >= 0 && hour <= 23) && (minute >= 0 && minute <= 59);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
}
