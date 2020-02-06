package JavaFundamentals.Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        if (numbers.length == 1) {
            System.out.println("0");
            return;
        }
        int sum = 0;
        for (int i = 0; i < numbers.length ; i++) {
            if (i > 0) {
                sum += numbers[i - 1];
            }
            int sum2 = 0;
            for (int j = i + 1; j < numbers.length ; j++) {
                sum2 += numbers[j];
            }
            if (sum == sum2) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("no");
    }
}
