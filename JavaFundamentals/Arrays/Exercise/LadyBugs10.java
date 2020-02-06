package JavaFundamentals.Arrays.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LadyBugs10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fieldSize = Integer.parseInt(scanner.nextLine());
        List<Integer> field = Arrays.asList(new Integer[fieldSize]);
        int[] count;
        count = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        if (count.length > 0 && count.length <= fieldSize) {
            for (int i = 0; i < count.length; i++) {
                if (count[i] != 0) {
                    field.set(i, 1);
                } else {
                    field.set(i, 0);
                }

            }
        }
        for (int i = 0; i < field.size(); i++) {
            if (field.get(i) == (null)) {
                field.set(i, 0);
            }
        }
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] command = input.split(" ");
            int ladyBugIndex = Integer.parseInt(command[0]);
            String direction = command[1];
            int steps = Integer.parseInt(command[2]);
            if (ladyBugIndex >= 0 && ladyBugIndex < fieldSize) {
                if (field.get(ladyBugIndex).equals(1)) {
                    if (direction.equals("right")) {
                        if (ladyBugIndex + steps >= field.size()) {
                            field.set(ladyBugIndex, 0);
                        } else if (field.get(ladyBugIndex + steps).equals(0)) {
                            field.set(ladyBugIndex + steps, 1);
                            field.set(ladyBugIndex, 0);
                            for (Integer integer : field) {
                                System.out.print(integer + " ");
                            }
                        } else {
                            for (int i = ladyBugIndex + steps; i < field.size(); i++) {
                                if (field.get(i).equals(0)) {
                                    field.set(i, 1);
                                }
                                field.set(ladyBugIndex, 0);
                            }
                        }
                    } else if (direction.equals("left")) {
                        if (ladyBugIndex - steps > 0) {
                            field.set(ladyBugIndex, 0);
                        } else if (field.get(ladyBugIndex - steps).equals(0)) {
                            field.set(ladyBugIndex - steps, 1);
                            field.set(ladyBugIndex, 0);
                        } else {
                            for (int i = ladyBugIndex - steps; i > 0; i--) {
                                if (field.get(i).equals(0)) {
                                    field.set(i, 1);
}

                                field.set(ladyBugIndex, 0);
                            }
                        }
                    }
                }
            }
        }
        for (Integer integer : field) {
            System.out.print(integer + " ");
        }
    }
}
