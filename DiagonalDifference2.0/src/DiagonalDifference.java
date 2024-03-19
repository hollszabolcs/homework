import java.util.Scanner;


public class DiagonalDifference {
    public static void main(String[] args) {

    }
        Scanner scanner = new Scanner(System.in);
        int length = getRows(scanner);
        int coulombs = getCoulombs(scanner);
        int[][] matrix = getMatrix(length, coulombs, scanner);
        int sum = getDiagonalDifference(length, matrix);
        System.out.println("The summarize of the Diagonial Difference is:" + sum);
    }

    public static int getRows(Scanner scanner) {
        System.out.println("How many rows would you like to fill");
        int rows = scanner.nextInt();
        return rows;
    }

    public static int getCoulombs(Scanner scanner) {
        System.out.println("And how many coulumns would you like?");
        int coulombs = scanner.nextInt();
        return coulombs;
    }

    public static int[][] getMatrix(int rows, int coulombs, Scanner scanner) {
        System.out.println("Please give numbers between 0 and 9");
        int[][] matrix = new int[rows][coulombs];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coulombs; j++) {
                System.out.print((i + 1) + "st row " + (j + 1) + "st' columb ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static int getDiagonalDifference(int matrixLength, int[][] matrix) {
        int counter = 0;
        int sumleft = 0;
        int sumright = 0;
        for (int i = 0; i < matrixLength; i++) {
            for (int j = 0; j <= j + 1; j++) {
                if (j == counter) {
                    sumleft += matrix[i][j];
                    counter++;
                    break;
                }
            }
        }
        counter = matrixLength - 1;
        for (int i = 0; i < matrixLength; i++) {
            for (int j = matrixLength - 1; j <= j + 1; j--) {
                if (j == counter) {
                    sumright += matrix[i][j];
                    counter--;
                    break;
                }
            }
        }
        return sumleft - sumright;
    }

}
