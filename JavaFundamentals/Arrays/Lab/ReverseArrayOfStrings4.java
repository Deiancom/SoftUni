package JavaFundamentals.Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayOfStrings4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbersLine = scanner.nextLine();
        String[] firstString = numbersLine.split(" ");
        for (int i = 0; i < firstString.length / 2; i++) {
            String oldString = firstString[i];
            firstString[i] = firstString[firstString.length - 1 - i];
            firstString[firstString.length - 1 - i] = oldString;
        }
        System.out.println(String.join(" ", firstString));
    }
}
