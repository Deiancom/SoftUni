package JavaFundamentals.ExamsPreparation.FinalExams.FinalExamRetake09August;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Followers03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> followers = new TreeMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Log out")) {
                break;
            }
            String[] tokens = input.split(": ");
            String command = tokens[0];
            String name = tokens[1];
            String[] nameCounter;

            switch (command) {
                case "New follower":
                    followers.putIfAbsent(name, 0);
                    break;
                case "Like":
                    int count = Integer.parseInt(tokens[2]);

                    if (followers.containsKey(name)) {
                        int tempCount = followers.get(name);
                        followers.put(name, count + tempCount);
                    } else {
                        followers.put(name, count);
                    }
                    break;
                case "Comment":
                    if (followers.containsKey(name)) {
                        int secondCount = followers.get(name);
                        followers.put(name, secondCount + 1);
                    } else {
                        followers.put(name, 1);
                    }
                    break;
                case "Blocked":
                    if (followers.containsKey(name)) {
                        followers.remove(name);
                    } else {
                        System.out.println(name + " doesn't exist.");
                    }
                    break;
            }
        }
        System.out.printf("%d followers%n", followers.size());
        followers.entrySet().stream().sorted((f, s) -> s.getValue() - f.getValue())
                .forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));
    }
}
