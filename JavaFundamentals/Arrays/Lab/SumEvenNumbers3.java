package JavaFundamentals.Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int result = 0;

        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] % 2 == 0) {
                result += numbers[i];
            }
        }
        System.out.println(result);
    }
}
