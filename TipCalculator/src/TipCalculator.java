import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tips = getCosts(scanner);
        int calcTip = getSpendings(tips, scanner);
        int getProp = getPropotion(scanner);
        int calcProp = calcPropotion(calcTip, getProp);
        scanner.close();
        System.out.println("total tip is " + calcProp + " Ft");
    }

    public static int[] getCosts(Scanner scanner) {
        int k = 1;
        int[] tips = new int[5];
        for (int numb : tips) {
            System.out.println("Please enter the " + k++ + "th cost of five");
            tips[numb] = scanner.nextInt();
        }
        return tips;
    }

    public static int getSpendings(int[] spendings, Scanner scanner) {
        int sumTip = 0;
        for (int spending : spendings) {
            sumTip += spending;
        }
        return sumTip;
    }

    public static int getPropotion(Scanner scanner) {
        System.out.println("The proportion of the tip:");
        int tipValue = scanner.nextInt();
        return tipValue;
    }

    public static int calcPropotion(int spendings, int tipValue) {
        if (tipValue < 10 || tipValue > 80) {
            return -1;
        }
        int totalCost = 0;
        totalCost = (int) (spendings * ((double) tipValue / 100));
        return totalCost;
    }
}
