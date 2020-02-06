package JavaAdvance.Multidimensional_Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimension = Arrays.stream(scanner.nextLine().split("\\s+"))
        .mapToInt(Integer::parseInt)
        .toArray();
        int rows = dimension[0];
        int columns = dimension[1];
        int[][] firstMatrix = new int[rows][];
        for (int row = 0; row < rows ; row++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
            .mapToInt(Integer::parseInt)
            .toArray();
            firstMatrix[row] = arr;
        }
        dimension = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int secondRows = dimension[0];
        int secondColumns = dimension[1];
        int[][] secondMatrix = new int[secondRows][];
        for (int row = 0; row < secondRows ; row++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            secondMatrix[row] = arr;
        }
        if (matricesAreEqual(firstMatrix, secondMatrix)) {
            System.out.print("equal");
        } else {
            System.out.print("not equal");
        }

    }
    private static boolean matricesAreEqual (int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }
        for (int row = 0; row < firstMatrix.length ; row++) {
            if (firstMatrix[row].length != secondMatrix[row].length) {
                return false;
            }
            for (int col = 0; col < firstMatrix[row].length ; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col]) {
                    return false;
                }
            }
        }
        return true;
    }
}
