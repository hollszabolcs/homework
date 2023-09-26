import java.util.Scanner;


public class DiagonalDifference {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int row = getRows(scanner);
        int coulumns = getCoulumns(scanner);
        int[][] matrix = getMatrix(row, coulumns, scanner);
        int sum = getDiagonalDifference(row, matrix);
        System.out.println("The summarize of the Diagonal Difference is:" + sum);
    }

    public static int getRows(Scanner scanner) {
        System.out.println("How many rows would you like to fill");
        int rows = scanner.nextInt();
        return rows;
    }

    public static int getCoulumns(Scanner scanner) {
        System.out.println("And how many coulumns would you like?");
        int coulombs = scanner.nextInt();
        return coulombs;
    }

    public static int[][] getMatrix(int rows, int coulumns, Scanner scanner) {
        System.out.println("Please give numbers between 0 and 9");
        int[][] matrix = new int[rows][coulumns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coulumns; j++) {
                System.out.print((i + 1) + "st row " + (j + 1) + "st' columb ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static int getDiagonalDifference(int matrixLength, int[][] matrix) {
        int sumleft = 0;
        int sumright = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumleft += matrix[i][i];
            sumright += matrix[i][matrixLength - 1 - i];
        }
        return sumleft - sumright;
    }
}

