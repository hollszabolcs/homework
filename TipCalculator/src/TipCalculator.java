import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tips = getCost(scanner);
        int calcTip = getSpendings(tips, scanner);
        int getProp = getPropotion(scanner);
        int calcProp = calcPropotion(calcTip, getProp);
        scanner.close();
        System.out.println("total tip is " + calcProp + " Ft");
    }

    public static int[] getCost(Scanner scanner) {
        int k = 1;
        int[] tips = new int[5];
        for (int numb : tips) {
            System.out.println("Please enter the " + k++ + "th cost of five");
            tips[numb] = scanner.nextInt();
        }
        return tips;
    }

    public static int getSpendings(int[] calculate, Scanner scanner) {
        int sumTip = 0;
        for (int numb : calculate) {
            sumTip += calculate[numb];
        }
        return sumTip;
    }

    public static int getPropotion(Scanner scanner) {
        System.out.println("The proportion of the tip:");
        int tipValue = scanner.nextInt();
        return tipValue;
    }

    public static int calcPropotion(int sumTip, int tipValue) {
        int totalCost = 0;
        if (tipValue <= 10) {
            totalCost = -1;
        } else if (tipValue >= 80) {
            totalCost = -1;
        } else {
            totalCost = (int) (sumTip * ((double) tipValue / 100));
        }
        return totalCost;
    }
}
