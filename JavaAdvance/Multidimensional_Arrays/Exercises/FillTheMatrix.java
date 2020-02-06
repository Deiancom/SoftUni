package JavaAdvance.Multidimensional_Arrays.Exercises;

import java.util.Scanner;

public class FillTheMatrix {
    public static int[][] matrix;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] info = scanner.nextLine().split(", ");
        int dimensions = Integer.parseInt(info[0]);
        String pattern = info[1];
        if (pattern.equals("A")) {
            matrix = generateMatrixWithPatternA(dimensions);
        } else {
            matrix = generateMatrixWithPatternB(dimensions);
        }

        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    private static int[][] generateMatrixWithPatternB(int dimensions) {
        int[][] matrix = new int[dimensions][dimensions];
        int value = 1;
        for (int col = 0; col < dimensions; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < dimensions; row++) {
                    matrix[row][col] = value;
                    value++;
                }
            } else {
                for (int row = dimensions - 1; row >= 0; row--) {
                    matrix[row][col] = value;
                    value++;
                }
            }
        }
        return matrix;
    }

    private static int[][] generateMatrixWithPatternA(int dimensions) {
        int[][] matrix = new int[dimensions][dimensions];
        int value = 1;
        for (int col = 0; col < dimensions; col++) {
            for (int row = 0; row < dimensions; row++) {
                matrix[row][col] = value;
                value++;
            }
        }
        return matrix;
    }
}
