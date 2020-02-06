package JavaFundamentals.Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputFieldSize = new int[Integer.parseInt(scanner.nextLine())];
        int[] fieldSizeIndex = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 0; i < fieldSizeIndex.length ; i++) {
            if (fieldSizeIndex[i] >= 0 && fieldSizeIndex[i] < inputFieldSize.length) {
                inputFieldSize[fieldSizeIndex[i]] = 1;
            }
        }
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] input = command.split(" ");
            int bugIndex = Integer.parseInt(input[0]);
            String flyDirection = input[1];
            int movePosition = Integer.parseInt(input[2]);
            if (bugIndex < 0 || bugIndex >= inputFieldSize.length || inputFieldSize[bugIndex] == 0) {
                continue;
            }
            inputFieldSize[bugIndex] = 0;
            int currentPosition = movePosition;
            if (flyDirection.equals("right")) {
                while (bugIndex + currentPosition < inputFieldSize.length && bugIndex + currentPosition >= 0) {
                    if (inputFieldSize[bugIndex + currentPosition] == 0) {
                        inputFieldSize[bugIndex + currentPosition] = 1;
                        break;
                    } else {
                        currentPosition += movePosition;
                    }
                }
            } else if (flyDirection.equals("left")) {
                while (bugIndex - currentPosition >= 0 &&  bugIndex - currentPosition < inputFieldSize.length) {
                    if (inputFieldSize[bugIndex - currentPosition] == 0) {
                        inputFieldSize[bugIndex - currentPosition] = 1;
                        break;
                    } else {
                        currentPosition += movePosition;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (int value : inputFieldSize) {
            System.out.print(value + " ");
        }

    }
}
