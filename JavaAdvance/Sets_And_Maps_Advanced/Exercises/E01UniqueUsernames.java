package JavaAdvance.Sets_And_Maps_Advanced.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class E01UniqueUsernames {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        Set<String> names = new LinkedHashSet<>();
        for (int i = 0; i < n ; i++) {
            String name = rd.readLine();
            names.add(name);
        }
        names.forEach(System.out::println);

    }
}
