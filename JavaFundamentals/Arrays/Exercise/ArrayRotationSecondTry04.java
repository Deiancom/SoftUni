package JavaFundamentals.Arrays.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayRotationSecondTry04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbersList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            numbersList.add(numbersList.get(0));
            numbersList.remove(0);
        }
        System.out.println(String.join(" ", numbersList));
    }
}
