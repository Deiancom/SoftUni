package JavaFundamentals.Arrays.Exercise;

import java.util.Scanner;

public class KaminoFactory09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int sequenceLengthIndex = Integer.MAX_VALUE;
        int sum = 0;
        int indexInRow = 0;
        int indexInRowOutput = 0;
        StringBuilder output = new StringBuilder();

        while (!input.equals("Clone them!")) {
            ++indexInRow;
            String[] data = input.split("!+");
            int[] dnaSequence = new int[length];
            for (int i = 0; i < dnaSequence.length; i++) {
                dnaSequence[i] = Integer.parseInt(data[i]);
            }
            int count = 0;
            int indexInSequence = 0;
            for (int i = 0; i < dnaSequence.length; i++) {
                int currentCount = 0;
                for (int j = i; j < dnaSequence.length; j++) {
                    if (dnaSequence[i] == dnaSequence[j]) {
                        currentCount++;
                        if (currentCount > count) {
                            count = currentCount;
                            indexInSequence = i;
                        }
                    } else {
                        break;
                    }
                }
            }
            int currentSum = 0;
            for (int value : dnaSequence) {
                if (value == 1) {
                    currentSum += value;
                }
            }
            if (indexInSequence < sequenceLengthIndex || currentSum > sum) {
                sequenceLengthIndex = indexInSequence;
                sum = currentSum;
                output = new StringBuilder();
                indexInRowOutput = indexInRow;
                for (int value : dnaSequence) {
                    output.append(value).append(" ");
                }
            }
            input = scanner.nextLine();
        }
        System.out.println(String.format("Best DNA sample %d with sum: %d.", indexInRowOutput, sum));
        System.out.println(output.toString().trim());
    }
}
