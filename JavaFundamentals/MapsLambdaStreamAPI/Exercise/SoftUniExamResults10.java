package JavaFundamentals.MapsLambdaStreamAPI.Exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SoftUniExamResults10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> nameAndPoints = new TreeMap<>();
        Map<String, Integer> languageAndCounts = new TreeMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("exam finished")) {
                break;
            }
            String username;
            String language;
            int points = 0;
            String[] command;
            if (input.contains("banned")) {
                command = input.split("-");
                username = command[0];
                nameAndPoints.remove(username);
            } else {
                command = input.split("-");
                username = command[0];
                language = command[1];
                points = Integer.parseInt(command[2]);
                int lastCount = 0;
                int lastPoints = 0;
                nameAndPoints.putIfAbsent(username, points);
                lastPoints = nameAndPoints.get(username);
                if (points > lastPoints) {
                    nameAndPoints.put(username, points);
                }
                languageAndCounts.putIfAbsent(language, lastCount);
                lastCount = languageAndCounts.get(language);
                if (languageAndCounts.containsKey(language)) {
                    languageAndCounts.put(language, lastCount + 1);
                }
            }
        }
        System.out.println("Results:");
        nameAndPoints.entrySet().stream().sorted((f, s) -> s.getValue() - f.getValue())
                .forEach(entry -> System.out.printf("%s | %d%n", entry.getKey(), entry.getValue()));
        System.out.println("Submissions:");
        languageAndCounts.entrySet().stream().sorted((f, s) -> s.getValue() - f.getValue())
                .forEach(entry -> System.out.printf("%s - %d%n", entry.getKey(), entry.getValue()));
    }
}
