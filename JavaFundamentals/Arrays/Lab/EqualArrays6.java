package JavaFundamentals.Arrays.Lab;

import java.util.Scanner;

public class EqualArrays6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstNumberString = scanner.nextLine();
        String secondNumberString = scanner.nextLine();
        String[] firstStringArray = firstNumberString.split(" ");
        String[] secondStringArray = secondNumberString.split(" ");
        int[] firstNumber = new int[firstStringArray.length];
        int[] secondNumber = new int[secondStringArray.length];
        int sum = 0;
        for (int i = 0; i < firstNumber.length; i++) {
            firstNumber[i] = Integer.parseInt(firstStringArray[i]);
        }
        for (int i = 0; i < secondNumber.length; i++) {
            secondNumber[i] = Integer.parseInt(secondStringArray[i]);
        }
        for (int i = 0; i < firstNumber.length; i++) {
            sum += firstNumber[i];
            if (firstNumber[i] != secondNumber[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                return;
            }
        }
        System.out.printf("Arrays are identical. Sum: %d", sum);
    }
}
