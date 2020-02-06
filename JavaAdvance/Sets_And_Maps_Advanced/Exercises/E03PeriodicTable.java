package JavaAdvance.Sets_And_Maps_Advanced.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class E03PeriodicTable {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        Set<String> elements = new TreeSet<>();
        for (int i = 0; i < n ; i++) {
            String[] input = rd.readLine().split(" ");
            elements.addAll(Arrays.asList(input));
        }
        elements.forEach(e -> System.out.print(e + " "));
    }
}
