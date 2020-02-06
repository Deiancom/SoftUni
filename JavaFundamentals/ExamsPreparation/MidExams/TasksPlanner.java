package JavaFundamentals.ExamsPreparation.MidExams;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TasksPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> taskTime = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        int completed = 0;
        int incomplete = 0;
        int dropped = 0;
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            if (tokens[0].equals("Complete")) {
                int index = Integer.parseInt(tokens[1]);
                if (index >= 0 && index < taskTime.size()) {
                    taskTime.set(index, 0);
                }
            } else if (tokens[0].equals("Change")) {
                int index = Integer.parseInt(tokens[1]);
                int time = Integer.parseInt(tokens[2]);
                if (index >= 0 && index < taskTime.size()) {
                    taskTime.set(index, time);
                }
            } else if (tokens[0].equals("Drop")) {
                int index = Integer.parseInt(tokens[1]);
                if (index >= 0 && index < taskTime.size()) {
                    taskTime.set(index, -1);
                }
            } else if (tokens[1].equals("Completed")) {
                for (int i = 0; i < taskTime.size() ; i++) {
                    if (taskTime.get(i) == 0) {
                        completed++;
                    }
                }
                System.out.println(completed);
            } else if (tokens[1].equals("Incomplete")) {
                for (int i = 0; i < taskTime.size() ; i++) {
                    if (taskTime.get(i) > 0) {
                        incomplete++;
                    }
                }
                System.out.println(incomplete);
            } else if (tokens[1].equals("Dropped")) {
                for (int i = 0; i < taskTime.size() ; i++) {
                    if (taskTime.get(i) < 0) {
                        dropped++;
                    }
                }
                System.out.println(dropped);
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < taskTime.size() ; i++) {
            if (taskTime.get(i) > 0) {
                System.out.print(taskTime.get(i) + " ");
            }
        }
    }
}
