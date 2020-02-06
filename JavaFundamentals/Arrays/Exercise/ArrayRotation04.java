package JavaFundamentals.Arrays.Exercise;

import java.util.Scanner;

public class ArrayRotation04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        int rotationCount = Integer.parseInt(scanner.nextLine());
        while (rotationCount != 0) {
            rotationCount--;
            String firstIndex = array[0];
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = firstIndex;
        }
        System.out.print(String.join(" ", array));
    }
}
