package JavaFundamentals.TextProcessing.Lab;

import java.util.Scanner;

public class TextFilter4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        for (String bannedWord : bannedWords) {
            if (text.contains(bannedWord)) {
                String replacement = repeatStr(bannedWord.length());
                text = text.replace(bannedWord, replacement);
            }
        }
        System.out.println(text);


    }
    private static String repeatStr(int length) {
        StringBuilder replacement = new StringBuilder();
        for (int i = 0; i < length ; i++) {
            replacement.append("*");
        }
        return replacement.toString();
    }
}
