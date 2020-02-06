package JavaFundamentals.Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxLoad = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] actions = (input).split(" ");

            if (actions[0].equals("Add")) {
                wagons.add(Integer.parseInt(actions[1]));
            } else {
                int people = Integer.parseInt(actions[0]);

                for (int i = 0; i < wagons.size(); i++) {
                    if (wagons.get(i) + people <= maxLoad) {
                        int sum = wagons.get(i);
                        sum += people;
                        wagons.set(i, sum);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (Integer wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }
}

