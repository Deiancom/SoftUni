package JavaAdvance.Multidimensional_Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];
        for (int row = 0; row < size; row++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = arr;
        }
        System.out.println(differenceDiagonalInMatrix(matrix, size));
    }

    public static int differenceDiagonalInMatrix(int[][] matrix, int size) {
        int d1 = 0;
        int d2 = 0;
        for (int row = 0; row < size; row++) {
            d1 += matrix[row][row];
            d2 += matrix[row][size - row - 1];
        }
        return Math.abs(d1 - d2);
    }
}
