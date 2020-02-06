package JavaAdvance.Multidimensional_Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isFound = false;
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
        int searchNumber = Integer.parseInt(scanner.nextLine());
        for (int row = 0; row < firstMatrix.length ; row++) {
            for (int col = 0; col < firstMatrix[row].length ; col++) {
                if (firstMatrix[row][col] == searchNumber) {
                    System.out.println(row + " " + col);
                    isFound = true;
                }
            }
        }
        if (!isFound) {
            System.out.println("not found");
        }
    }
}
