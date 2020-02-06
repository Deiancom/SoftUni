package JavaAdvance.Sets_And_Maps_Advanced.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class E04CountSymbols {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Integer> textMap = new TreeMap<>();
        String inputText = rd.readLine();
        for (int i = 0; i < inputText.length(); i++) {
            if (!textMap.containsKey(inputText.charAt(i))) {
                textMap.put(inputText.charAt(i), 1);
            } else {
                int current = textMap.get(inputText.charAt(i));
                current++;
                textMap.put(inputText.charAt(i), current);
            }
        }
        for (Map.Entry<Character, Integer> entry : textMap.entrySet()) {
            System.out.printf("%c: %d time/s%n", entry.getKey(), entry.getValue());
        }
    }
}
