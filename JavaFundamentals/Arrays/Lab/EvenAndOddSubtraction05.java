package JavaFundamentals.Arrays.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EvenAndOddSubtraction05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int evenSum = 0;
        int oddSum = 0;
        for (Integer integer : numbersList) {
            if (integer % 2 == 0) {
                evenSum += integer;
            } else {
                oddSum += integer;
            }
        }
        System.out.println(evenSum - oddSum);
    }
}
