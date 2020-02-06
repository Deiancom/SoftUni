package JavaFundamentals.MapsLambdaStreamAPI;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Judge02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Integer>> courseNamePoints = new LinkedHashMap<>();
        Map<String, List<String>> count = new TreeMap<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("no more time")) {
                break;
            }
            String[] command = input.split("\\s+->\\s+");
            String course = command[1];
            String name = command[0];
            int points = Integer.parseInt(command[2]);
            courseNamePoints.putIfAbsent(course, new LinkedHashMap<>());
            courseNamePoints.get(course).putIfAbsent(name, -1);
            if (courseNamePoints.get(course).get(name) < points) {
                courseNamePoints.get(course).put(name, points);
            }
            count.putIfAbsent(course, new ArrayList<>());
            count.get(course).add(name);
        }
        AtomicInteger num = new AtomicInteger(1);

        courseNamePoints.forEach((key, value) -> {
            num.set(1);
            System.out.println(key + ": " + value.size() + " participants");
            value.entrySet().stream().sorted((k2, k1) -> {
                int sort = Integer.compare(k1.getValue(), k2.getValue());
                if (sort == 0) {
                    sort = k2.getKey().compareTo(k1.getKey());

                }
                return sort;
            }).forEach(element -> {
                System.out.printf("%d. %s <::> %d%n", num.getAndIncrement(), element.getKey(), element.getValue());
            });
        });
        Map<String, Integer> standings = new LinkedHashMap<>();

        for (Map.Entry<String, Map<String, Integer>> getNames : courseNamePoints.entrySet()) {
            for (Map.Entry<String, Integer> getPoints : getNames.getValue().entrySet()) {
                standings.putIfAbsent(getPoints.getKey(), 0);
                standings.put(getPoints.getKey(), standings.get(getPoints.getKey()) + getPoints.getValue());
            }
        }
        System.out.println("Individual standings:");
        num.set(1);

        standings.entrySet().stream().sorted((e2, e1) -> {
            int sort = Integer.compare(e1.getValue(), e2.getValue());
            if (sort == 0) {
                sort = e2.getKey().compareTo(e1.getKey());
            }
            return sort;

        }).forEach(element -> {
            System.out.printf("%d. %s -> %d\n", num.getAndIncrement(), element.getKey(), element.getValue());
        });
    }
}
