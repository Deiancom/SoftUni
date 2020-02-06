package JavaFundamentals.Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeListSecondTry02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> elementsList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("end")) {
                break;
            }
            String[] tokens = command.split("\\s+");
            if (tokens[0].equals("Delete")) {
                int index = Integer.parseInt(tokens[1]);
                elementsList.removeIf(n -> n.equals(index));
            } else if (tokens[0].equals("Insert")) {
                int index = Integer.parseInt(tokens[2]);
                int number = Integer.parseInt(tokens[1]);
                if (index < elementsList.size()) {
                    elementsList.add(index, number);
                }
            }
        }
        for (Integer integer : elementsList) {
            System.out.print(integer + " ");
        }
    }
}
