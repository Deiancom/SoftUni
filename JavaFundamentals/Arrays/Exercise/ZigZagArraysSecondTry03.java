package JavaFundamentals.Arrays.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ZigZagArraysSecondTry03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> firstNumbers = new ArrayList<>();
        List<Integer> secondNumbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int[] list = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (i % 2 == 0) {
                firstNumbers.add(list[0]);
                secondNumbers.add(list[1]);
            } else {
                firstNumbers.add(list[1]);
                secondNumbers.add(list[0]);
            }
        }
        for (Integer firstNumber : firstNumbers) {
            System.out.print(firstNumber + " ");
        }
        System.out.println();
        for (Integer secondNumber : secondNumbers) {
            System.out.print(secondNumber + " ");
        }
    }
}
