package JavaFundamentals.Arrays.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CommonElementsSecondTry02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> firstList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        List<String> secondList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        secondList.retainAll(firstList);
        System.out.println(String.join(" ", secondList));
    }
}
