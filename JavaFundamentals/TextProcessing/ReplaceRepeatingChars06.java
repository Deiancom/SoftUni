package JavaFundamentals.TextProcessing;

import java.util.Scanner;

public class ReplaceRepeatingChars06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < text.length() - 1 ; i++) {
            char realChar = text.charAt(i);
            char check = text.charAt(i + 1);
            if (realChar != check) {
                output.append(realChar);

            }
        }
        output.append(text.charAt(text.length()-1));
        System.out.println(output);
    }
}
