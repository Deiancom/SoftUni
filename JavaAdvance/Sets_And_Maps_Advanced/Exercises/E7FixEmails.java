package JavaAdvance.Sets_And_Maps_Advanced.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class E7FixEmails {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> namesAndEmails = new LinkedHashMap<>();
        String input = rd.readLine();
        while (!input.equals("stop")) {
            String email = rd.readLine().toLowerCase();
            if (email.endsWith("uk") || email.endsWith("us") || email.endsWith("com")) {

            } else {
                namesAndEmails.put(input, email);
            }
            input = rd.readLine();
        }
        namesAndEmails.forEach((key, value) -> System.out.printf("%s -> %s%n", key, value));
    }
}
