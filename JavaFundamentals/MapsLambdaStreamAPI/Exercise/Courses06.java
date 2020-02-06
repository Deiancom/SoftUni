package JavaFundamentals.MapsLambdaStreamAPI.Exercise;

import java.util.*;

public class Courses06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> courseAndNames = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] command = input.split(" : ");
            commands(courseAndNames, command);
        }
        courseAndNames.entrySet().stream().sorted((f, s) ->
                s.getValue().size() - f.getValue().size())
                .forEach(entry -> {
                    System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().stream().sorted(String::compareTo)
                            .forEach(e -> System.out.printf("-- %s%n", e));
                });
    }

    static void commands(Map<String, List<String>> courseAndNames, String[] command) {
        String course = command[0];
        String name = command[1];
        if (courseAndNames.containsKey(course)) {
            if (!courseAndNames.get(course).contains(name)) {
                courseAndNames.get(course).add(name);
            }

        } else {
            courseAndNames.putIfAbsent(course, new ArrayList<>());
            courseAndNames.get(course).add(name);
        }
    }
}
