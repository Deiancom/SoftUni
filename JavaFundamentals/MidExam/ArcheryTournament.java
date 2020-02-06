package JavaFundamentals.MidExam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArcheryTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> field = Arrays.stream(scanner.nextLine().split("\\|"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        int points = 0;
        while (!input.equals("Game over")) {
            String[] commands = input.split("@");
            switch (commands[0]) {
                case "Shoot Left": {
                    int startIndex = Integer.parseInt(commands[1]);
                    int length = Integer.parseInt(commands[2]);
                    if (startIndex >= 0 && startIndex < field.size()) {
                        length = startIndex - length;
                        while (startIndex - length >= 0) {
                            length = Math.abs(startIndex - length);
                            length = (field.size() - length);
                        }
                        if (length >= field.size()) {
                            length = Math.abs(field.size() - length);
                        }
                        points = getPoints(field, points, length);
                    }
                    break;
                }
                case "Shoot Right": {
                    int startIndex = Integer.parseInt(commands[1]);
                    int length = Integer.parseInt(commands[2]);
                    if (startIndex >= 0 && startIndex < field.size()) {
                        length = startIndex + length;
                        if (length > field.size()) {
                            while (length > field.size()) {
                                length = length - field.size();
                            }
                        }
                        points = getPoints(field, points, length);
                    }
                    break;
                }
                case "Reverse":
                    Collections.reverse(field);
                    break;
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < field.size(); i++) {
            if (i < field.size() - 1) {
                System.out.print(field.get(i) + " - ");
            } else {
                System.out.print(field.get(i));
            }
        }
        System.out.println();
        System.out.printf("Iskren finished the archery tournament with %d points!", points);
    }

    private static int getPoints(List<Integer> field, int points, int length) {
        int currentPoints = field.get(length);
        if (currentPoints < 5) {
            points += currentPoints;
            currentPoints = 0;
        } else {
            points += 5;
            currentPoints -= 5;
        }
        field.set(length, currentPoints);
        return points;
    }
}
