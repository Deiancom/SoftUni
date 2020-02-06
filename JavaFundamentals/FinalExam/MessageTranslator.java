package JavaFundamentals.FinalExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MessageTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        String regex = "!([A-Z][a-z][a-z]+)!([:])\\[(\\w\\w\\w\\w\\w\\w\\w\\w+)]";
        for (int i = 0; i < count; i++) {
            String input = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                List<String> toList = Arrays.stream(matcher.group().split(":")).collect(Collectors.toList());
                String message = toList.get(0).replaceAll("!", "");
                List<Character> toPrint = new ArrayList<>();
                String name = toList.get(1).replaceAll("[\\[\\]]", "");
                for (int j = 0; j < name.length(); j++) {
                    toPrint.add(name.charAt(j));
                }
                System.out.print(message + ": ");
                for (Character character : toPrint) {
                    int ch = character;
                    System.out.printf("%d ", ch);
                }
                System.out.println();

            } else {
                System.out.println("The message is invalid");
            }
        }
    }
}
