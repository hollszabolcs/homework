import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tips = getCost(scanner);
        int calcTip = calculateCost(tips, scanner);
        int getProp = getPropotion(scanner);
        int calcProp = calcPropotion(calcTip, getProp);
        scanner.close();
        System.out.println("total tip is " + calcProp + " Ft");
    }

    public static int[] getCost(Scanner scanner) {
        int k = 1;
        int[] tips = new int[5];
        for (int i = 0; i < tips.length; i++) {
            System.out.println("Please enter the " + k +  "th cost of five");
            k+=1;
            tips[i] = scanner.nextInt();
        }
        return tips;
    }

    public static int calculateCost(int[] calculate, Scanner scanner) {
        int sumTip = 0;
        int totalCost = 0;
        for (int i = 0; i < calculate.length; i++) {
            sumTip += calculate[i];
        }
    return sumTip;
    }
    public static int getPropotion(Scanner scanner){
        System.out.println("The proportion of the tip:");
        int tipValue = scanner.nextInt();
        return tipValue;
    }
    public static int calcPropotion(int sumTip, int tipValue){
        int totalCost = 0;
        if (tipValue < 10) {
            System.out.println("-1 because the proportion of the tip is too low ");
        } else if (tipValue > 80) {
            System.out.println("-1 because the proportion of the tip is too high ");
        } else {
            totalCost = (int) (sumTip * ((double) tipValue / 100));
        }
        return totalCost;
    }
}
