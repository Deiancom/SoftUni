package JavaFundamentals.TextProcessing.Lab;

import java.util.Scanner;

public class DigitsLettersAndOther5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder chars = new StringBuilder();
        for (int i = 0; i < input.length() ; i++) {
            if (Character.isDigit(input.charAt(i))) {
                digits.append(input.charAt(i));
            } else if (Character.isLetter(input.charAt(i))) {
                letters.append(input.charAt(i));
            }else {
                chars.append(input.charAt(i));
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(chars);
    }
}
