import java.util.Scanner;

public class DayOfMonths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a number");
        byte month = scanner.nextByte();
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("This month has 30 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("This month has 31 days");
                break;
            case 2:
                System.out.println("This month has 28/29 days");
                break;
            default:
                System.err.println("number is out of range");
                break;

        }
        scanner.close();
    }

}
