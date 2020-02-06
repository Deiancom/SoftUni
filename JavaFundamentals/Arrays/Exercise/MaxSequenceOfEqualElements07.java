package JavaFundamentals.Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sequence = 0;
        int index = 0;
        for (int i = 0; i < numbers.length ; i++) {
            int currentSequence = 0;
            for (int j = i; j < numbers.length ; j++) {
                if (numbers[i] == numbers[j]) {
                    currentSequence++;
                    if (currentSequence > sequence) {
                        sequence = currentSequence;
                        index = i;
                    }
                } else {
                    break;
                }
            }
        }
        for (int i = 0; i < sequence ; i++) {
            System.out.print(numbers[i + index] + " ");
        }
    }
}
