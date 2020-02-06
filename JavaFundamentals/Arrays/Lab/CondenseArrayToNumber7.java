package JavaFundamentals.Arrays.Lab;

import java.util.Scanner;

public class CondenseArrayToNumber7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbersLine = scanner.nextLine();
        String[] stringNumbers = numbersLine.split(" ");
        int[] numbers = new int[stringNumbers.length];
        for (int x = 0; x < numbers.length ; x++) {
            numbers[x] = Integer.parseInt(stringNumbers[x]);
        }
        while (numbers.length > 1) {
            int[] condensed = new int[numbers.length - 1];
            for (int i = 0; i < condensed.length ; i++) {
                condensed[i] = numbers[i] + numbers[i +1];
            }
            numbers = condensed;
        }
        System.out.println(numbers[0]);
    }
}
