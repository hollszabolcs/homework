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
        String numbersInEnglish = "";
        long errorNumber = 1000000000000000L;
        long trillionNumber = 100000000000000L;
        long billionNumber = 100000000000L;
        long millionNumber = 1000000L;
        int thousandNumber = 1000;
        int hundredNUmber = 100;
        if (number > errorNumber || number < 0) {
            System.err.println("Fatal error! The number is too big or too small");
        } else {
            if (number >= trillionNumber) {                                   //TRILlION
                long numberCut = number / 1000000000000L;
                if (numberCut > 100) {
                    int Hundreds = (int) numberCut / 100;
                    numbersInEnglish += ONE_TO_NINETEEN[Hundreds] + " " + HUNDRED;
                    numberCut -= Hundreds * 100;
                }
                if (numberCut >= 20) {
                    numbersInEnglish += " " + TWENTY_TO_NINETY[(int) numberCut / 10];
                    numberCut %= 10;
                    numbersInEnglish += HYPHEN + ONE_TO_NINETEEN[(int) numberCut] + TRILLION;
                } else {
                    numbersInEnglish += " " + ONE_TO_NINETEEN[(int) numberCut] + BILLION;
                }
            }
            if (number % 1000000000000L >= billionNumber) {//BILlION
                long numberCut = (number % 1000000000000L) / 1000000000L;
                if (numberCut > 100) {
                    int Hundreds = (int) numberCut / 100;
                    numbersInEnglish += ONE_TO_NINETEEN[Hundreds] +  HUNDRED;
                    numberCut -= Hundreds * 100;
                }
                if (numberCut >= 20) {
                    numbersInEnglish += " " + TWENTY_TO_NINETY[(int) numberCut / 10];
                    numberCut %= 10;
                    numbersInEnglish += HYPHEN + ONE_TO_NINETEEN[(int) numberCut] + " billion,";
                } else {
                    numbersInEnglish += " " + ONE_TO_NINETEEN[(int) numberCut] + " billion,";
                }
            }
            if (number % 1000000000L >= millionNumber) {                                   //MILlION
                long numberCut = (number % 1000000000L) / 1000000;
                if (numberCut > 100) {
                    int millionHundreds = (int) numberCut / 100;
                    numbersInEnglish += ONE_TO_NINETEEN[millionHundreds] + HUNDRED;
                    numberCut -= millionHundreds * 100;
                }
                if (numberCut >= 20) {
                    numbersInEnglish += " " + TWENTY_TO_NINETY[(int) numberCut / 10];
                    numberCut %= 10;
                    numbersInEnglish += HYPHEN + ONE_TO_NINETEEN[(int) numberCut] + MILLION;
                } else {
                    numbersInEnglish += " " + ONE_TO_NINETEEN[(int) numberCut] + MILLION;
                }
            }
            if (number % 1000000000L >= thousandNumber) {//THOUSAND
                long numberCut = (number % 1000000L) / 10;
                if (numberCut > 100) {
                    int Hundreds = (int) numberCut / 100;
                    numbersInEnglish += ONE_TO_NINETEEN[Hundreds] + THOUSAND;
                    numberCut -= Hundreds * 100;
                }
                if (numberCut >= 20) {
                    numbersInEnglish += " " + TWENTY_TO_NINETY[(int) numberCut /10];
                    numberCut %= 10;
                    numbersInEnglish += HYPHEN + ONE_TO_NINETEEN[(int) numberCut];
                } else {
                    numbersInEnglish += " " + ONE_TO_NINETEEN[(int) numberCut];
                }
            }
            if (number % 1000 >= hundredNUmber) {                                   //HUNDRED
                long numberCut = (number % 1000);
                if (numberCut > 100) {
                    int millionHundreds = (int) numberCut / 100;
                    numbersInEnglish += ONE_TO_NINETEEN[millionHundreds] + HUNDRED;
                    numberCut -= millionHundreds * 100;
                }
                if (numberCut >= 20) {
                    numbersInEnglish += " " + TWENTY_TO_NINETY[(int) numberCut / 10];
                    numberCut %= 10;
                    numbersInEnglish += HYPHEN + ONE_TO_NINETEEN[(int) numberCut];
                } else {
                    numbersInEnglish += " " + ONE_TO_NINETEEN[(int) numberCut];
                }
            }
            System.out.println(numbersInEnglish);
            scanner.close();
        }
    }
}
