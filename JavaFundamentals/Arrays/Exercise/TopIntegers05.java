package JavaFundamentals.Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayNumbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int start = 0; start < arrayNumbers.length; start++) {

            int number = arrayNumbers[start];
            boolean itsValid = true;
            for (int i = start + 1; i < arrayNumbers.length; i++) {
                if (number <= arrayNumbers[i]) {
                    arrayNumbers[i] = arrayNumbers[i];
                    itsValid = false;
                    break;
                }
            }
            if (itsValid) {
                System.out.print(number + " ");
            }
        }
    }
}