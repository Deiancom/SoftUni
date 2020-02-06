package JavaFundamentals.MapsLambdaStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        text = text.replaceAll(" ", "");
        Map<Character, Integer> mappedText = new LinkedHashMap<>();
        for (int i = 0; i < text.length(); i++) {
            mappedText.putIfAbsent(text.charAt(i), 0);
            mappedText.put(text.charAt(i), mappedText.get(text.charAt(i)) + 1);
        }
        for (Map.Entry<Character, Integer> entry : mappedText.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
