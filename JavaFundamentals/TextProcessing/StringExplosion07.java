package JavaFundamentals.TextProcessing;

import java.util.Scanner;

public class StringExplosion07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder output = new StringBuilder(input);
        int blast = 0;
        for (int i = 0; i < output.length(); i++) {
            if (blast > 0 && output.charAt(i) != '>') {
                output.deleteCharAt(i);
                blast--;
                i--;
            } else if (output.charAt(i) == '>') {
                blast += Integer.parseInt(String.valueOf(output.charAt(i + 1)));
            }
        }
        System.out.println(output);
    }
}
