package JavaFundamentals.FinalExam;

import java.util.*;
import java.util.stream.Collectors;

public class NikuldenMeals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> likeMap = new TreeMap<>();
        int counter = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Stop")) {
                break;
            }
            String[] tokens = input.split("-");
            String command = tokens[0];
            String name = tokens[1];
            String meal = tokens[2];
            if (command.equals("Like")) {
                if (!likeMap.containsKey(name)) {
                    likeMap.putIfAbsent(name, new ArrayList<>());
                }
                likeMap.get(name).add(meal);
            } else if (command.equals("Unlike")) {
                if (!likeMap.containsKey(name)) {
                    System.out.printf("%s is not at the party.%n", name);
                } else if (!likeMap.get(name).contains(meal)) {
                    System.out.printf("%s doesn't have the %s in his/her collection.%n", name, meal);
                } else {
                    System.out.printf("%s doesn't like the %s.%n", name, meal);
                    likeMap.get(name).remove(meal);
                    counter++;
                }
            }
        }
        likeMap = likeMap.entrySet().stream().sorted((f, s) ->
                s.getValue().size() - f.getValue().size()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                (e1, e2) -> e2, LinkedHashMap::new));
        for (Map.Entry<String, List<String>> kvp : likeMap.entrySet()) {
            List<String> likeName = kvp.getValue();
            System.out.printf("%s: ", kvp.getKey());
            for (int i = 0; i < likeName.size(); i++) {
                String meal = likeName.get(i);
                if (i < likeName.size() - 1) {
                    System.out.printf("%s, ", meal);
                } else {
                    System.out.printf("%s", meal);
                }
            }
            System.out.println();
        }
        System.out.printf("Unliked meals: %d", counter);
    }
}
