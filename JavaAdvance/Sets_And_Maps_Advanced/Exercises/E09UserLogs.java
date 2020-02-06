package JavaAdvance.Sets_And_Maps_Advanced.Exercises;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class E09UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Integer>> namesAndAddress = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split("IP=| |r=");
            String ipAddress = tokens[1];
            String name = tokens[4];
            if (namesAndAddress.containsKey(name)) {
                if (!namesAndAddress.get(name).containsKey(ipAddress)) {
                    namesAndAddress.get(name).put(ipAddress, 1);
                } else {
                    int count = namesAndAddress.get(name).get(ipAddress);
                    count++;
                    namesAndAddress.get(name).put(ipAddress, count);
                }
            } else {
                namesAndAddress.put(name, new LinkedHashMap<>());
                namesAndAddress.get(name).put(ipAddress, 1);
            }
            input = scanner.nextLine();
        }
        namesAndAddress.forEach((key, value) -> {
            System.out.printf("%s: %n", key);
            AtomicInteger count = new AtomicInteger(value.size());
            value.forEach((e, i) -> {
                count.getAndDecrement();
                if (count.intValue() >= 1) {
                    System.out.printf("%s => %d, ", e, i);
                } else {
                    System.out.printf("%s => %d.%n", e, i);
                }
            });
        });
    }
}
