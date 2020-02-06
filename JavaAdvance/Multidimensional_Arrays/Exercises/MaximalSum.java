package JavaAdvance.Multidimensional_Arrays.Exercises;


import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {

    public static int[][] matrix;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = readIntArray(scanner);
        int rows = dimensions[0];
        int cols = dimensions[1];
        matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            int[] arr = readIntArray(scanner);
            matrix[row] = arr;
        }
        int maxSum = - 1;
        int rowIndex = -1;
        int colIndex = -1;
        for (int row = 1; row < rows - 1 ; row++) {
            for (int col = 1; col < cols - 1 ; col++) {
                int sum = calculateMatrixSum(row, col);
                if (sum > maxSum) {
                    maxSum = sum;
                    rowIndex = row;
                    colIndex = col;
                }
            }
        }
        System.out.println("Sum = " + maxSum);
        printMatrixByGivenCell(rowIndex, colIndex);
    }

    private static void printMatrixByGivenCell(int rowIndex, int colIndex) {
        int startRow = rowIndex - 1;
        int startCol = colIndex - 1;
        for (int row = startRow; row < startRow + 3 ; row++) {
            for (int col = startCol; col < startCol + 3 ; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int calculateMatrixSum(int row, int col) {
        int sum = 0;
        sum += matrix[row][col];
        sum += matrix[row][col + 1];
        sum += matrix[row][col - 1];
        sum += matrix[row - 1][col];
        sum += matrix[row + 1][col];
        sum += matrix[row - 1][col + 1];
        sum += matrix[row - 1][col - 1];
        sum += matrix[row + 1][col + 1];
        sum += matrix[row +1][col -1];
        return sum;
    }

    private static int[] readIntArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
