package Time;


public class Output {
    Input input = new Input();

    int hour;

    int minute;


    public void output() {
        input.getError();
        hour = input.hour;
        minute = input.minute;
        String output = covertToText(hour, minute);
        System.out.println(output);
    }

    String covertToText(int hour, int minute) {
        if (hour > 12) {
            hour -= 12;
        }
        if (hour == 12 && minute == 0) {
            return "It is a noon";
        }
        if (hour == 0 && minute == 0) {
            return "It is midnight";
        }
        if (hour != 0 && minute == 0) {
            return "It is " + Numbers.values()[hour].getText() + " o' clock";
        }
        if (minute > 0 && minute <= 30) {
            return "It is " + Numbers.values()[minute].getText() + " past " + Numbers.values()[hour].getText();
        }
        if (minute > 30) {
            return "It is " + Numbers.values()[60 - minute].getText() + " to " + Numbers.values()[1 + hour].getText();
        }
        return null;
    }
}
