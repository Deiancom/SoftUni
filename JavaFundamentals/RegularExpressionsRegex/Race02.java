package JavaFundamentals.RegularExpressionsRegex;

import java.util.*;
import java.util.stream.Collectors;

public class Race02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> namesAndKm = new TreeMap<>();
        String[] toMap = scanner.nextLine().split(", ");
        for (String s : toMap) {
            namesAndKm.put(s, 0);
        }
        while (true) {
            String regex = "\\w";
            String text = scanner.nextLine();
            if (text.equals("end of race")) {
                break;
            }
            // Pattern pattern = Pattern.compile(regex);
            //Matcher matcher = pattern.matcher(text);
            //String text = matcher.group();
            StringBuilder name = new StringBuilder();
            int kilometers = 0;
            for (int i = 0; i < text.length(); i++) {
                char symbol = text.charAt(i);
                if (Character.isDigit(symbol)) {
                    kilometers += Integer.parseInt(Character.toString(symbol));
                } else if (Character.isLetter(symbol)) {
                    name.append(text.charAt(i));
                }
            }
            if (namesAndKm.containsKey(name.toString())) {
                int km = namesAndKm.get(name.toString());
                namesAndKm.put(name.toString(), km + kilometers);
            }
        }
        namesAndKm = namesAndKm.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .limit(3)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        int count = 1;
        for (Map.Entry<String, Integer> kvp : namesAndKm.entrySet()) {
            String place = "1st";
            String name = kvp.getKey();
            if (count == 2) {
                place = "2nd";
            } else if (count == 3) {
                place = "3rd";
            }
            System.out.printf("%s place: %s%n", place, name);
            count++;
        }
    }
}
