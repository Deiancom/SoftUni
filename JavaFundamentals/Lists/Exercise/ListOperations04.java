package JavaFundamentals.Lists.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class ListOperations04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] command = input.split("\\s+");

            if (command[0].equals("Add")) {
                int number = Integer.parseInt(command[1]);
                numbersList.add(number);
            } else if (command[0].equals("Insert")) {
                int number = Integer.parseInt(command[1]);
                int index = Integer.parseInt(command[2]);
                if (index < 0 || index >= numbersList.size()) {
                    System.out.println("Invalid index");
                } else {
                    numbersList.add(index, number);
                }
            } else if (command[0].equals("Remove")) {
                int number = Integer.parseInt(command[1]);
                if (number < 0 || number >= numbersList.size()) {
                    System.out.println("Invalid index");
                } else {
                    numbersList.remove(number);
                }
            } else if (command[1].equals("left")) {
                int numberMove = Integer.parseInt(command[2]);
                for (int i = 0; i < numberMove; i++) {
                    int temp = numbersList.get(0);
                    numbersList.remove(0);
                    numbersList.add(temp);
                }
            } else if (command[1].equals("right")) {
                int numberMove = Integer.parseInt(command[2]);
                for (int i = 0; i < numberMove; i++) {
                    int temp = numbersList.get(numbersList.size() - 1);
                    numbersList.remove(numbersList.size() - 1);
                    numbersList.add(0, temp);
                }
            }
            input = scanner.nextLine();
        }
        for (Integer integer : numbersList) {
            System.out.print(integer + " ");
        }
    }
}