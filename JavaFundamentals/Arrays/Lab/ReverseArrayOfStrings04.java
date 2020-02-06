package JavaFundamentals.Arrays.Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseArrayOfStrings04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        Collections.reverse(stringList);
        System.out.println(String.join(" ",stringList));
    }
}
