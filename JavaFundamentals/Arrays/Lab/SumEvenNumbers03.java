package JavaFundamentals.Arrays.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumEvenNumbers03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int sum = 0;
        for (Integer integer : numbersList) {
            if (integer % 2 == 0) {
                sum += integer;
            }
        }
        System.out.println(sum);
    }
}
