import java.util.Scanner;

public class NumberConverter {
    private static final String[] ONE_TO_NINETEEN = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] TWENTY_TO_NINETY = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    private static final String HUNDRED = " hundred";
    private static final String TRILLION = " trillion, ";
    private static final String BILLION = " billion, ";
    private static final String MILLION = " million, ";
    private static final String THOUSAND = " thousand ";
    private static final String HYPHEN = "-";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a number");
        long number = getNumber(scanner);
        getText(number);
    }

    public static long getNumber(Scanner scanner) {
        long number = scanner.nextLong();
        long errorNumber = 100_000_000_000_000_0L;
        if (number > errorNumber || number <= 0) {
            System.err.println("Fatal error! The number is too big or too small");
        }
        return number;
    }

    public static String getTrillion(long number) {
        long numberCut = number / 1000000000000L;
        int hundreds = 0;
        String numberInEnglish = "";
        if (numberCut > 100) {
            hundreds = (int) numberCut / 100;
            numberInEnglish += ONE_TO_NINETEEN[hundreds] + HUNDRED;
            numberCut -= hundreds * 100;
        }
        if (numberCut >= 20) {
            numberInEnglish += " " + TWENTY_TO_NINETY[(int) numberCut / 10];
            numberCut %= 10;
            numberInEnglish += HYPHEN + ONE_TO_NINETEEN[(int) numberCut] + TRILLION;
        } else {
            numberInEnglish += ONE_TO_NINETEEN[(int) numberCut] + TRILLION;
        }
        return numberInEnglish;
    }

    public static String getBillion(long number) {
        long numberCut = (number / 1000000000L) % 1000;
        int hundreds = 0;
        String numberInEnglish = "";
        if (numberCut > 100) {
            hundreds = (int) numberCut / 100;
            numberInEnglish += ONE_TO_NINETEEN[hundreds] + HUNDRED;
            numberCut -= hundreds * 100;
        }
        if (numberCut >= 20) {
            numberInEnglish += " " + TWENTY_TO_NINETY[(int) numberCut / 10];
            numberCut %= 10;
            numberInEnglish += HYPHEN + ONE_TO_NINETEEN[(int) numberCut] + BILLION;
        } else {
            numberInEnglish += ONE_TO_NINETEEN[(int) numberCut] + BILLION;
        }
        return numberInEnglish;
    }

    public static String getMillion(long number) {
        long numberCut = (number / 1000000L) % 1000;
        int hundreds = 0;
        String numberInEnglish = "";
        if (numberCut > 100) {
            hundreds = (int) numberCut / 100;
            numberInEnglish += ONE_TO_NINETEEN[hundreds] + HUNDRED;
            numberCut -= hundreds * 100;
        }
        if (numberCut >= 20) {
            numberInEnglish += " " + TWENTY_TO_NINETY[(int) numberCut / 10];
            numberCut %= 10;
            numberInEnglish += HYPHEN + ONE_TO_NINETEEN[(int) numberCut] + MILLION;
        } else {
            numberInEnglish += ONE_TO_NINETEEN[(int) numberCut] + MILLION;
        }
        return numberInEnglish;
    }

    public static String getThousand(long number) {
        long numberCut = (number / 1000) % 1000;
        int hundreds = 0;
        String numberInEnglish = "";
        if (numberCut >= 100) {
            hundreds = (int) numberCut / 100;
            numberInEnglish += ONE_TO_NINETEEN[hundreds] + HUNDRED;
            numberCut -= hundreds * 100;
        }
        if (numberCut >= 20) {
            numberInEnglish += " " + TWENTY_TO_NINETY[(int) numberCut / 10];
            numberCut %= 10;
            numberInEnglish += HYPHEN + ONE_TO_NINETEEN[(int) numberCut] + THOUSAND;
        }/* else {
            numberInEnglish += ONE_TO_NINETEEN[(int) numberCut] + THOUSAND;
        }*/
        return numberInEnglish;

    }

    public static String getHundred(long number) {
        long numberCut = number % 1000;
        int hundreds = 0;
        String numberInEnglish = "";
        if (numberCut >= 100) {
            hundreds = (int) numberCut / 100;
            numberInEnglish += ONE_TO_NINETEEN[hundreds] + HUNDRED;
            numberCut -= hundreds * 100;
        }
        if (numberCut >= 20) {
            numberInEnglish += " " + TWENTY_TO_NINETY[(int) numberCut / 10];
            numberCut %= 10;
            numberInEnglish += HYPHEN + ONE_TO_NINETEEN[(int) numberCut];
        }/* else {
            numberInEnglish += ONE_TO_NINETEEN[(int) numberCut];
        }*/
        return numberInEnglish;
    }

    public static String getUnderTen(long number) {
        long numberCut = number % 100;
        int hundreds = 0;
        String numberInEnglish = "";
        if (numberCut >= 1) {
            numberInEnglish += " " + ONE_TO_NINETEEN[(int) numberCut];

        }
        return numberInEnglish;
    }

    public static String getText(long number) {
        String SumText = "";
        if (number / 1_000_000_000_000L >= 1) {
            SumText += getTrillion(number);
            number %= 1_000_000_000_000L;
        }
        if (number / 1_000_000_000L >= 1) {
            SumText += getBillion(number);
            number %= 1_000_000_000L;
        }
        if (number / 1_000_000L >= 1) {
            SumText += getMillion(number);
            number %= 1_000_000L;
        }

        if (number / 1_000 >= 1) {
            SumText += getThousand(number);
            number %= 1_000;
        }
        if (number / 100 >= 1) {
            SumText += getHundred(number);
            number %= 100;
        }
        if (number >= 1) {
            SumText += getUnderTen(number);
        }
        System.out.println(SumText);
        return SumText;
    }

}
