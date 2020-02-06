package JavaFundamentals.ExamsPreparation.MidExams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FroggySquad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> frogsNames = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        while (true) {
            String[] commands = scanner.nextLine().split("\\s+");
            switch (commands[0]) {
                case "Join":
                    frogsNames.add(commands[1]);
                    break;
                case "Jump":
                    int jump = Integer.parseInt(commands[2]);
                    if (jump >= 0 && jump < frogsNames.size()) {
                        frogsNames.add(jump, commands[1]);
                    }
                    break;
                case "Dive":
                    int index = Integer.parseInt(commands[1]);
                    if (index >= 0 && index < frogsNames.size()) {
                        frogsNames.remove(index);
                        break;
                    }
                case "First":
                    int count = Integer.parseInt(commands[1]);
                    System.out.println(frogsNames.stream().limit(count).collect(Collectors.joining(" ")));
                    break;
                case "Last":
                    int last = Integer.parseInt(commands[1]);
                    System.out.println(frogsNames.stream().skip(Math.max(frogsNames.size() - last, 0)).collect(Collectors.joining(" ")));
                    break;
                case "Print":
                    String direction = commands[1];
                    if (!direction.equals("Normal")) {
                        Collections.reverse(frogsNames);
                    }
                    System.out.println("Frogs: " + String.join(" ", frogsNames));
                    return;
            }
        }
    }
}
