package JavaAdvance.Sets_And_Maps_Advanced.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class E11LogsAggregator {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());

        Map<String, int[]> nameAndTime = new TreeMap<>();
        Map<String, TreeSet<String>> ipAddresses = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = rd.readLine().split(" ");
            nameAndTime.putIfAbsent(input[1], new int[1]);
            nameAndTime.get(input[1])[0] += Integer.parseInt(input[2]);

            ipAddresses.putIfAbsent(input[1], new TreeSet<>());
            ipAddresses.get(input[1]).add(input[0]);
        }
        nameAndTime.forEach((p, t) ->
                System.out.printf("%s: %d [%s]%n", p, t[0], String.join(", ", ipAddresses.get(p))));
    }
}
