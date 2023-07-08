import java.util.Scanner;

public class NumberConverter {

    private static final String[] ONE_TO_NINETEEN = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] TWENTY_TO_NINETY = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    private static final String HUNDRED = " hundred";
    private static final String TRILLION = " trillion, ";
    private static final String BILLION = " bilLion, ";
    private static final String MILLION = " milLion, ";
    private static final String THOUSAND = " thousand ";
    private static final String HYPHEN = "-";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a number");
        long number = scanner.nextLong();
        String numberInEnglish = "";
        long errorNumber = 1000000000000000L;
        long trillionNumber = 100000000000000L;
        long billionNumber = 100000000000L;
        long millionNumber = 1000000L;
        int thousandNumber = 1000;
        int hundredNumber = 100;
        int hundreds = 0;
        if (number > errorNumber || number <= 0) {
            System.err.println("Fatal error! The number is too big or too small");
        } else {
            if (number >= trillionNumber) {                                   //TRILlION
                long numberCut = number / 1000000000000L;
                if (numberCut > 100) {
                    hundreds = (int) numberCut / 100;
                    numberInEnglish += ONE_TO_NINETEEN[hundreds] + " " + TRILLION;
                    numberCut -= hundreds * 100;
                }
                if (numberCut >= 20) {
                    numberInEnglish += " " + TWENTY_TO_NINETY[(int) numberCut / 10];
                    numberCut %= 10;
                    numberInEnglish += HYPHEN + ONE_TO_NINETEEN[(int) numberCut] + HUNDRED;
                } else {
                    numberInEnglish += "and " + ONE_TO_NINETEEN[(int) numberCut] + TRILLION;
                }
            }
            if (number % 1000000000000L >= billionNumber) {//BILlION
                long numberCut = (number % 1000000000000L) / 1000000000L;
                if (numberCut > 100) {
                    hundreds = (int) numberCut / 100;
                    numberInEnglish += ONE_TO_NINETEEN[hundreds] + HUNDRED;
                    numberCut -= hundreds * 100;
                }
                if (numberCut >= 20) {
                    numberInEnglish += " " + TWENTY_TO_NINETY[(int) numberCut / 10];
                    numberCut %= 10;
                    numberInEnglish += HYPHEN + ONE_TO_NINETEEN[(int) numberCut] + " billion,";
                } else {
                    numberInEnglish += " " + ONE_TO_NINETEEN[(int) numberCut] + " billion,";
                }
            }
            if (number % 1000000000L >= millionNumber) {                                   //MILlION
                long numberCut = (number % 1000000000L) / 1000000;
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
                    numberInEnglish += " " + ONE_TO_NINETEEN[(int) numberCut] + MILLION;
                }
                number = number % 1000000;
            }
            if (number >= thousandNumber) {//THOUSAND
                if (number > 99999) {
                    int thousands = (int) number / 100000;
                    numberInEnglish += ONE_TO_NINETEEN[thousands] + HUNDRED;
                }
                if (number > 1000) {
                    int thousands = (int) (number % 100000) / 10000;
                    numberInEnglish += TWENTY_TO_NINETY[thousands];
                }
                if (number > 100) {
                    int thousands = (int) (number % 10000) / 1000;
                    numberInEnglish += ONE_TO_NINETEEN[thousands] + " " + THOUSAND;
                } else {
                    numberInEnglish += " " + THOUSAND;
                }
                number = (number % 10000);
            }
            //HUNDRED
            if (number > 100) {
                hundreds = (int) (number % 1000) / 100;
                numberInEnglish += ONE_TO_NINETEEN[hundreds] + HUNDRED;
                number = number % 100;
            }
            if (number >= 20) {
                numberInEnglish += " " + TWENTY_TO_NINETY[(int) number / 10];
                number %= 10;
            }
            if (number <= 19) {
                numberInEnglish += HYPHEN + ONE_TO_NINETEEN[(int) number];
            }
        }
        System.out.println(numberInEnglish);
        scanner.close();
    }
}
