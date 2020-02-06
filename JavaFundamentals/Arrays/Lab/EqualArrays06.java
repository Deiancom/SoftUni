package JavaFundamentals.Arrays.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EqualArrays06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        if (firstList.equals(secondList)) {
            int sum = 0;
            for (Integer integer : firstList) {
                sum += integer;
            }
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            for (int i = 0; i < firstList.size(); i++) {
                if (!firstList.get(i).equals(secondList.get(i))) {
                    System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                    return;
                }
            }
        }
    }
}
