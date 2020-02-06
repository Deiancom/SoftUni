package JavaAdvance.Sets_And_Maps_Advanced.Exercises;

import java.util.*;
import java.util.stream.Collectors;

public class E12LegendaryFarming {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, Integer> keyMaterials = new TreeMap<>();
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);
        Map<String, Integer> junk = new TreeMap<>();
        int numberToAdd;
        String winner = " ";
        while (winner.equals(" ")) {
            List<String> collectList = Arrays.stream(scanner.nextLine().toLowerCase().split("\\s+"))
                    .collect(Collectors.toList());
            for (int i = 0; i < collectList.size(); i++) {
                if (i % 2 != 0) {
                    String mat = collectList.get(i);
                    if (mat.equals("shards") || mat.equals("fragments") || mat.equals("motes")) {
                        numberToAdd = keyMaterials.get(collectList.get(i));
                        keyMaterials.put(collectList.get(i), numberToAdd + Integer.parseInt(collectList.get(i - 1)));
                        winner = theWinnerIs(keyMaterials, winner, collectList.get(i));
                        if (!winner.equals(" ")) {
                            recalculatesWinnerMaterial(keyMaterials, collectList.get(i));
                            break;
                        }
                    } else {
                        junk.putIfAbsent(collectList.get(i), 0);
                        numberToAdd = junk.get(collectList.get(i));
                        junk.put(collectList.get(i), numberToAdd + Integer.parseInt(collectList.get(i - 1)));
                    }

                }
            }
        }
        System.out.println(winner + " obtained!");
        keyMaterials.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(result -> System.out.printf("%s: %d%n", result.getKey(), result.getValue()));

        junk.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(result -> System.out.printf("%s: %d%n", result.getKey(), result.getValue()));
    }

    public static String theWinnerIs(TreeMap<String, Integer> keyMath, String winner, String key) {
        if (keyMath.get(key) >= 250) {
            switch (key) {
                case "shards":
                    winner = "Shadowmourne";
                    break;
                case "fragments":
                    winner = "Valanyr";
                    break;
                case "motes":
                    winner = "Dragonwrath";
                    break;
                default:
                    break;
            }
        }
        return winner;
    }

    public static void recalculatesWinnerMaterial(TreeMap<String, Integer> keyMaterials, String key) {
        int newValue = keyMaterials.get(key) - 250;
        keyMaterials.put(key, newValue);
    }
}


