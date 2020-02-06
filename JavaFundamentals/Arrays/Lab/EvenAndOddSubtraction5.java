package JavaFundamentals.Arrays.Lab;

import java.util.Scanner;

public class EvenAndOddSubtraction5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineOfNumbers = scanner.nextLine();
        String[] numbersOfString = lineOfNumbers.split(" ");
        int[] numbers = new int[numbersOfString.length];
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = Integer.parseInt(numbersOfString[i]);
            if (numbers[i] % 2 == 0) {
                evenSum += numbers[i];
            } else {
                oddSum += numbers[i];
            }
        }
        System.out.printf("%d",evenSum - oddSum);

    }
}
