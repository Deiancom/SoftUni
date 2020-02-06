package JavaAdvance.Sets_And_Maps_Advanced.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class E08HandsOfCards {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        Map<String, List<String>> playersMap = new LinkedHashMap<>();
        Map<String, Integer> test = new LinkedHashMap<>();
        String input = rd.readLine();

        while (!input.equals("JOKER")) {
            String[] tokens = input.split(": |, ");
            String names = tokens[0];
            int sum = 0;
            for (int i = 1; i < tokens.length; i++) {
                String card = tokens[i];
                int result = 0;
                switch (card.substring(0, card.length() - 1)) {
                    case "2":
                        result = 2;
                        break;
                    case "3":
                        result = 3;
                        break;
                    case "4":
                        result = 4;
                        break;
                    case "5":
                        result = 5;
                        break;
                    case "6":
                        result = 6;
                        break;
                    case "7":
                        result = 7;
                        break;
                    case "8":
                        result = 8;
                        break;
                    case "9":
                        result = 9;
                        break;
                    case "10":
                        result = 10;
                        break;
                    case "J":
                        result = 11;
                        break;
                    case "Q":
                        result = 12;
                        break;
                    case "K":
                        result = 13;
                        break;
                    case "A":
                        result = 14;
                        break;
                }
                switch (card.substring(card.length() - 1)) {
                    case "S":
                        result = result * 4;
                        break;
                    case "H":
                        result = result * 3;
                        break;
                    case "D":
                        result = result * 2;
                        break;
                    case "C":
                        result = result * 1;
                        break;
                }
                sum += result;
            }
       //     playersMap.put(names, sum);
            input = rd.readLine();
        }
        playersMap.forEach((key, value) -> System.out.printf("%s: %d%n", key, value));
    }
}
