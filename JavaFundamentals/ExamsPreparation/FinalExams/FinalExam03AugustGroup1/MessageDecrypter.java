package JavaFundamentals.ExamsPreparation.FinalExams.FinalExam03AugustGroup1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MessageDecrypter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        String regex = "(^[$%])([A-Z][a-z][a-z]+)\\1:\\s*\\[(\\d+)][|]\\[(\\d+)\\][|]\\[(\\d+)\\]\\|$";
        for (int i = 0; i < count ; i++) {
            String input = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                List<String> toList = Arrays.stream(matcher.group().split("[: |]")).collect(Collectors.toList());
                String name = toList.get(0);
                name = name.replaceAll("[%$\\s+]", "");
                String one = toList.get(2).replaceAll("[\\[\\]\\s+]", "");
                String two = toList.get(3).replaceAll("[\\[\\]\\s+]", "");
                String tree = toList.get(4).replaceAll("[\\[\\]\\s+]", "");
                int first = Integer.parseInt(one);
                int second = Integer.parseInt(two);
                int third = Integer.parseInt(tree);

                System.out.printf("%s: %c%c%c%n", name, first, second, third);

            } else {
                System.out.println("Valid message not found!");
            }
        }
    }
}
