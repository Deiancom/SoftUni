package JavaFundamentals.MapsLambdaStreamAPI.Exercise;

import java.util.*;

public class ForceBook09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> firstTeam = new TreeMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Lumpawaroo")) {
                break;
            }
            String[] command;
            String side;
            String name;
            if (input.contains("|")) {
                command = input.split("\\s+\\|\\s+");
                side = command[0];
                name = command[1];

                if (firstTeam.values().stream().noneMatch(list -> list.contains(name))) {
                    if (!firstTeam.containsKey(side)) {
                        firstTeam.putIfAbsent(side, new ArrayList<>());
                    }
                    firstTeam.get(side).add(name);
                }
            } else {
                command = input.split("\\s+->\\s+");
                side = command[1];
                name = command[0];
                if (firstTeam.values().stream().anyMatch(list -> list.contains(name))) {
                    for (Map.Entry<String, List<String>> entry : firstTeam.entrySet()) {
                        entry.getValue().remove(name);
                    }
                }
                if (!firstTeam.containsKey(side)) {
                    firstTeam.putIfAbsent(side, new ArrayList<>());
                }
                firstTeam.get(side).add(name);
                System.out.printf("%s joins the %s side!%n", name, side);
            }
        }
        firstTeam.entrySet().stream()
                .filter(users -> users.getValue().size() > 0)
                .sorted((f, s) ->
                        s.getValue().size() - f.getValue().size())
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().stream().sorted(String::compareTo)
                            .forEach(e -> System.out.printf("! %s%n", e));
                });
    }
}
