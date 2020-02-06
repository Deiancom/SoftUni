package JavaAdvance.Sets_And_Maps_Advanced.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        Set<String> normalGuestSet = new TreeSet<>();
        String input = rd.readLine();
        while (!input.equals("PARTY")) {
            normalGuestSet.add(input);
            input = rd.readLine();
        }
        while (!input.equals("END")) {
            normalGuestSet.remove(input);
            input = rd.readLine();
        }
        System.out.println(normalGuestSet.size());
        normalGuestSet.forEach(System.out::println);
    }
}
