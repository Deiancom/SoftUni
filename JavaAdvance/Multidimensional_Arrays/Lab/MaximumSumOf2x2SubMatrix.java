package JavaAdvance.Multidimensional_Arrays.Lab;

import java.util.*;

public class MaximumSumOf2x2SubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimension = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = dimension[0];
        int cols = dimension[1];
        int[][] matrix = new int[rows][cols];
        List<Integer> list = new ArrayList<>();

        for (int row = 0; row < rows ; row++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[row] = arr;
        }
    }
}
