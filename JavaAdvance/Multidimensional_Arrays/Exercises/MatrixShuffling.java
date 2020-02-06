package JavaAdvance.Multidimensional_Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = input[0];
        int cols = input[1];
        String[][] matrix = new String[rows][cols];
        for (int row = 0; row < rows ; row++) {
            String[] arr = scanner.nextLine().split("\\s+");
            matrix[row] = arr;
        }
        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String[] tokens = command.split(" ");
            if (tokens[0].equals("swap") && tokens.length == 5) {
                int firstRow = Integer.parseInt(tokens[1]);
                int firstCol = Integer.parseInt(tokens[2]);
                int secondRow = Integer.parseInt(tokens[3]);
                int secondCol = Integer.parseInt(tokens[4]);
                try {
                    String temp = matrix[firstRow][firstCol];
                    matrix[firstRow][firstCol] = matrix[secondRow][secondCol];
                    matrix[secondRow][secondCol] = temp;
                    for (int row = 0; row < rows ; row++) {
                        for (int col = 0; col < cols ; col++) {
                            System.out.print(matrix[row][col] + " ");
                        }
                        System.out.println();
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println("Invalid input!");
            }
            command = scanner.nextLine();
        }
    }
}
