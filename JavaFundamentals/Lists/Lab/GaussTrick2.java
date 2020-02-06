package JavaFundamentals.Lists.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class GaussTrick2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int size = numbers.size();
        int i = 0;
        while (i < size / 2 ) {
                numbers.set(i, numbers.get(i) + numbers.get(numbers.size() - 1));
                numbers.remove(numbers.size() - 1);
                i++;
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
