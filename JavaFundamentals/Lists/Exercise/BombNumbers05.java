package JavaFundamentals.Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> field = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int[] specialAndBomb = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        while (field.contains(specialAndBomb[0])) {
            int index = field.indexOf(specialAndBomb[0]);
            int right = Math.min(field.size() - 1, index + specialAndBomb[1]);
            int left = Math.max(0, index - specialAndBomb[1]);

            if (right >= left) {
                field.subList(left, right + 1).clear();
            }
        }
        int sum = 0;
        for (Integer integer : field) {
            sum += integer;
        }
        System.out.println(sum);
    }
}
