package JavaAdvance.Multidimensional_Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = readIntArray(scanner);
        int rows = input[0];
        int cols = input[1];
        char[][] matrix = new char[rows][cols];
        char a = 'a';
        char b = 'a';
        for (int row = 0; row < rows ; row++) {
            for (int col = 0; col < cols ; col++) {
                System.out.print(a);
                System.out.print(b);
                System.out.print(a);
                System.out.print(" ");
                b++;
            }
            System.out.println();
            a++;
            b = a;
        }
    }
    private static int[] readIntArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
