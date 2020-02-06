package JavaFundamentals.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SumDigits02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        int sum = 0;

        do {
            sum = sum +(digit % 10);
            digit /= 10;
        } while (digit > 0);
        System.out.println(sum);
    }
}
