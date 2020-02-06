package JavaFundamentals.Lists.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class ListManipulationAdvanced5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("end")) {
                break;
            }
            String[] tokens = command.split(" ");
            switch (tokens[0]) {
                case "Contains":
                    int contains = Integer.parseInt(tokens[1]);
                    if (numbers.contains(contains)) {
                        System.out.println("Yes");
                    } else {
                            System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (tokens[1].equals("even")) {
                        for (Integer number : numbers) {
                            if (number % 2 == 0) {
                                System.out.print(number + " ");
                            }
                        }
                    } else if (tokens[1].equals("odd")) {
                        for (Integer number : numbers) {
                            if (number % 2 != 0) {
                                System.out.print(number + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case "Get":
                    int sum = 0;
                    for (Integer item : numbers) {
                        sum += item;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    StringBuilder output = new StringBuilder();
                    int filter = Integer.parseInt(tokens[2]);
                    switch (tokens[1]) {
                        case ">":
                            for (Integer value : numbers) {
                                if (value > filter) {
                                    output.append(value).append(" ");
                                }
                            }
                            System.out.println(output);
                            break;
                        case "<":
                            for (Integer value : numbers) {
                                if (value < filter) {
                                    output.append(value).append(" ");
                                }
                            }
                            System.out.println(output);
                            break;
                        case ">=":
                            for (Integer value : numbers) {
                                if (value >= filter) {
                                    output.append(value).append(" ");
                                }
                            }
                            System.out.println(output);
                            break;
                        case "<=":
                            for (Integer number : numbers) {
                                if (number <= filter) {
                                    output.append(number).append(" ");
                                }
                            }
                            System.out.print(output);
                            break;
                    }
                    break;
            }
        }
    }
}
