package JavaAdvance.Multidimensional_Arrays.Lab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        String[][] firstMatrix = new String[rows][columns];
        for (int row = 0; row < rows; row++) {
            String[] arr = scanner.nextLine().split("\\s+");
            firstMatrix[row] = arr;
        }
        String[][] secondMatrix = new String[rows][columns];
        for (int row = 0; row < rows; row++) {
            String[] arr = scanner.nextLine().split("\\s+");
            secondMatrix[row] = arr;
        }
        String[][] thirdMatrix = new String[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                String firstElement = firstMatrix[row][col];
                String secondElement = secondMatrix[row][col];
                if (!firstElement.equals(secondElement)) {
                    thirdMatrix[row][col] = "*";
                    continue;
                }
                thirdMatrix[row][col] = firstElement;

            }
        }
        for (String[] matrix : thirdMatrix) {
            System.out.println(Arrays.toString(matrix).replaceAll("\\[|\\]|,", ""));
        }

    }
}
