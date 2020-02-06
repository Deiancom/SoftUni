package JavaFundamentals.ExamsPreparation.FinalExams.FinalExamRetake09August;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Password02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        String regex = "(\\S+)>([0-9]{3})\\|([a-z]{3})\\|([A-Z]{3})\\|([^<>]{3})<\\1";

        for (int i = 0; i < count ; i++) {
            String input = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                List<String> toList = Arrays.stream(matcher.group().split("[<>|]")).collect(Collectors.toList());
                toList.remove(0);
                toList.remove(toList.size() - 1);
                System.out.print("Password: ");
                System.out.println(String.join("", toList));
            } else {
                System.out.println("Try another password!");
            }
        }
    }
}
