package JavaFundamentals.Lists.Lab;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;


public class SumAdjacentEqualNumbers1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> number = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        int i = 0;
        while (i < number.size() - 1) {
            if (number.get(i).equals(number.get(i + 1))) {
                number.set(i, number.get(i) + number.get(i + 1));
                number.remove(i + 1);
                i = 0;
            } else {
                i++;
            }
        }
        String output = joinByDelimiter(number);
        System.out.println(output);

    }

    static String joinByDelimiter(List<Double> items) {
        StringBuilder output = new StringBuilder();
        for (Double item : items) {
            output.append(new DecimalFormat("0.#").format(item)).append(" ");
        }
        return output.toString();
    }
}
