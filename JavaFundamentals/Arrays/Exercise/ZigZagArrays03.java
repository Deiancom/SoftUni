package JavaFundamentals.Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int[] firstArray = new int[number];
        int[] secondArray = new int[number];
        for (int i = 0; i < number; i++) {
            int[] input = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            if (i % 2 == 0) {
                firstArray[i] = input[0];
                secondArray[i] = input[1];
            } else {
                firstArray[i] = input[1];
                secondArray[i] = input[0];
            }
        }
        for (int i = 0; i < number; i++) {
            System.out.print(firstArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < number; i++) {
            System.out.print(secondArray[i] + " ");
        }
    }
}
