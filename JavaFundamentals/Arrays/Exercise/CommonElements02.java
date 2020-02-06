package JavaFundamentals.Arrays.Exercise;

import java.util.Scanner;

public class CommonElements02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (String currentElement : secondArray) {
            for (String compareElement : firstArray) {
                if (currentElement.equals(compareElement)) {
                    System.out.print(compareElement + " ");
                }

            }

        }

    }
}
