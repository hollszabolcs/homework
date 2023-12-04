package time;


public class TimeConverter {
    Input input = new Input();

    private int hour;

    private int minute;

    public void output() {
        input.printError();
        hour = input.getHour();
        minute = input.getMinute();
        String output = convertToText(hour, minute);
        System.out.println(output);
    }

    String convertToText(int hours, int minutes) {
        String magicString = "It is ";
        if (hours > 12) {
            hours -= 12;
        }
        if (hours == 12 && minutes == 0) {
            return magicString + "is noon";
        }
        if (hours == 0 && minutes == 0) {
            return magicString + "is midnight";
        }
        if (hours != 0 && minutes == 0) {
            return magicString + Numbers.values()[hours].getText() + " o' clock";
        }
        if (minutes > 0 && minutes <= 30) {
            return "It is " + Numbers.values()[minutes].getText() + " past " + Numbers.values()[hours].getText();
        }
        if (minutes > 30) {
            return magicString + Numbers.values()[60 - minutes].getText() + " to " + Numbers.values()[1 + hours].getText();
        }
        return null;
    }
}
