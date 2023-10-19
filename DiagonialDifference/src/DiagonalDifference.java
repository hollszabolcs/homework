import java.util.Scanner;


public class DiagonalDifference {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int row = getRows(scanner);
        int columns = getColumns(scanner);
        int[][] matrix = getMatrix(row, columns, scanner);
        int sum = getDiagonalDifference(matrix);
        System.out.println("The summarize of the Diagonal Difference is:" + sum);
    }

    public static int getRows(Scanner scanner) {
        System.out.println("How many rows would you like to fill");
        int rows = scanner.nextInt();
        return rows;
    }

    public static int getColumns(Scanner scanner) {
        System.out.println("And how many columns would you like?");
        int columns = scanner.nextInt();
        return columns;
    }

    public static int[][] getMatrix(int rows, int columns, Scanner scanner) {
        System.out.println("Please give numbers between 0 and 9");
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print((i + 1) + "st row " + (j + 1) + "st' columb ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static int getDiagonalDifference(int[][] matrix) {
        int sumleft = 0;
        int sumright = 0;
        int numRows = matrix.length;
        for (int i = 0; i < numRows; i++) {
            sumleft += matrix[i][i];
            sumright += matrix[i][numRows - 1 - i];
        }
        return sumleft - sumright;
    }
}

