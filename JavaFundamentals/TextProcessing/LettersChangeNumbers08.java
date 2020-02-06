package JavaFundamentals.TextProcessing;

import java.util.Scanner;

public class LettersChangeNumbers08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] texts = scanner.nextLine().split("\\s+");
        double result = 0;

        for (String text : texts) {
            int position;
            int secondPosition;
            double sum = 0;
            StringBuilder num = new StringBuilder();
            for (int j = 0; j < text.length(); j++) {
                char check = text.charAt(j);

                if (text.charAt(j) >= '0' && text.charAt(j) <= '9') {
                    num.append(check);
                }
            }
            int number = Integer.parseInt(String.valueOf(num));
            if (text.charAt(0) >= 'A' && text.charAt(0) <= 'Z') {
                position = text.charAt(0) - 'A' + 1;
                sum = number / (double) position;

            } else if (text.charAt(0) >= 'a' && text.charAt(0) <= 'z') {
                position = text.charAt(0) - 'a' + 1;
                sum = number * position;
            }
            if (text.charAt(text.length() - 1) >= 'A' && text.charAt(text.length() - 1) <= 'Z') {
                secondPosition = text.charAt(text.length() - 1) - 'A' + 1;
                sum -= secondPosition;
            } else if (text.charAt(text.length() - 1) >= 'a' && text.charAt(text.length() - 1) <= 'z') {
                secondPosition = text.charAt(text.length() - 1) - 'a' + 1;
                sum += secondPosition;
            }
            result += sum;
        }
        System.out.printf("%.2f", result);
    }
}
