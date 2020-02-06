package JavaFundamentals.MapsLambdaStreamAPI.Exercise;

import java.util.*;

public class CompanyUsers08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> company = new TreeMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }
            String[] command = input.split(" -> ");
            Courses06.commands(company, command);
        }
        company.forEach((key, value) -> {
            System.out.printf("%s%n", key);
            value.forEach(e -> System.out.printf("-- %s%n", e));
        });
    }
}
