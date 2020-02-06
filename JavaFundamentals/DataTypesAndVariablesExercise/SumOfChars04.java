package JavaFundamentals.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SumOfChars04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            String input = scanner.nextLine();
            sum += input.charAt(0);
        }
        System.out.printf("The sum equals: %d", sum);
    }
}