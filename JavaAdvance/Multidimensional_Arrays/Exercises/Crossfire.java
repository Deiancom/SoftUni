package JavaAdvance.Multidimensional_Arrays.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Crossfire {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        int[] info = Arrays.stream(rd.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<List<Integer>> mat = new ArrayList<>(info[0]);
        int n = 1;

        for (int i = 0; i < info[0]; i++) {
            mat.add(new ArrayList<>());
            for (int j = 0; j < info[1]; j++)
                mat.get(i).add(n++);
        }

        String command;
        while (!("Nuke it from orbit").equals(command = rd.readLine())) {
            int[] input = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int row = input[0];
            int col = input[1];
            int rad = input[2];

            for (int i = row - rad; i <= row + rad; i++) {

                if (i == row)
                    removeRow(mat, row, col, rad);
                else if (valid(mat, i, col))
                    mat.get(i).remove(col);
            }

            mat.removeIf(List::isEmpty);
        }

        printMatrix(mat);
    }

    private static void removeRow(List<List<Integer>> mat, int row, int col, int rad) {
        for (int i = col + rad; i >= col - rad; i--)
            if (valid(mat, row, i))
                mat.get(row).remove(i);
    }

    private static void printMatrix(List<List<Integer>> mat) {
        for (List<Integer> ints : mat)
            if (!ints.isEmpty()) System.out.println(ints.toString().replaceAll("[\\[\\],]", ""));
    }

    private static boolean valid(List<List<Integer>> mat, int row, int col) {
        return 0 <= row && row < mat.size() && 0 <= col && col < mat.get(row).size();
    }
}

