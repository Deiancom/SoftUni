package JavaFundamentals.TextProcessing.Lab;

import java.util.Scanner;

public class ReverseStrings1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = (scanner.nextLine());
        while (!input.equals("end")) {
            StringBuilder toPrint = new StringBuilder(input);
            System.out.println(input + " = " + toPrint.reverse());
            input = scanner.nextLine();
        }
    }
}
