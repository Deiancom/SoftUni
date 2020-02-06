package JavaFundamentals.Arrays.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TopIntegersSecondTry05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        for (int i = 0; i <= numbersList.size(); i++) {
            if (numbersList.get(i) < numbersList.get(i + 1)) {
                numbersList.remove(numbersList.get(i));
                i--;
            }
        }
        for (Integer integer : numbersList) {
            System.out.print(integer + " ");
        }
    }
}
