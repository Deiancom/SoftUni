package JavaFundamentals.TextProcessing.Lab;

import java.util.Scanner;

public class Substring3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        int index = second.indexOf(first);
        while (index != -1) {
            second = second.replace(first, "");
            index = second.indexOf(first);
        }
        System.out.println(second);
    }
}
