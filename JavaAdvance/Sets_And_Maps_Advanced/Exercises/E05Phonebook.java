package JavaAdvance.Sets_And_Maps_Advanced.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class E05Phonebook {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> phoneBook = new HashMap<>();

        String input = rd.readLine();
        while (!input.equals("search")) {
            String[] tokens = input.split("-");
            String name = tokens[0];
            String number = tokens[1];
            phoneBook.put(name, number);
            input = rd.readLine();
        }
        input = rd.readLine();
        while (!input.equals("stop")) {
            if (phoneBook.containsKey(input)) {
                System.out.printf("%s -> %s%n", input, phoneBook.get(input));
            } else {
                System.out.printf("Contact %s does not exist.%n", input);
            }
            input = rd.readLine();
        }
    }
}
