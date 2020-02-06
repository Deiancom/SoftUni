package JavaFundamentals.RegularExpressionsRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        System.out.println("Bought furniture:");
        while (true) {
            String regex = ">>\\w+<<\\d+\\.?\\d+!\\d+";
            String input = scanner.nextLine();
            if (input.equals("Purchase")) {
                break;
            }
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String[] furniture;
                furniture = matcher.group().split("<<|!");
                String toPrint = furniture[0];
                toPrint = toPrint.replaceAll(">>", "");
                System.out.printf("%s%n", toPrint);
                double price = Double.parseDouble(furniture[1]);
                int quantity = Integer.parseInt(furniture[2]);
                sum += price * quantity;
            }
        }
        System.out.printf("Total money spend: %.2f", sum);

    }
}
