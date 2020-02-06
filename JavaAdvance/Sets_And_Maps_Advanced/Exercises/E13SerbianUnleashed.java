package JavaAdvance.Sets_And_Maps_Advanced.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E13SerbianUnleashed {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String regex = "(\\D+)\\s@(\\D+)\\s(\\d+)\\s(\\d+)";
        String input = rd.readLine();
        Map<String, Map<String, Integer>> map = new LinkedHashMap<>();
        while (!input.equals("End")) {
            Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String singer = matcher.group(1);
                String town = matcher.group(2);
                int ticketPrice = Integer.parseInt(matcher.group(3));
                int ticketsCount = Integer.parseInt(matcher.group(4));
                if (!map.containsKey(town)) {
                    map.put(town, new LinkedHashMap<>());
                }
                if (!map.get(town).containsKey(singer)) {
                    map.get(town).put(singer, 0);
                }
                int current = map.get(town).get(singer);
                map.get(town).put(singer, current + (ticketPrice * ticketsCount));

            }
            input = rd.readLine();
        }
        map.forEach((key, value) -> {
            System.out.printf("%s%n", key);
            value.entrySet()
                    .stream().sorted((p1, p2) -> p2.getValue().compareTo(p1.getValue()))
                    .forEach(singer -> System.out.printf("#  %s -> %d%n", singer.getKey(), singer.getValue()));

        });
    }
}
