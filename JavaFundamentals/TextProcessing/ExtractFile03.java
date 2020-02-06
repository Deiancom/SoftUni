package JavaFundamentals.TextProcessing;

import java.util.Scanner;

public class ExtractFile03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\\\");
        int index = input.length;
        String toExtract = input[index - 1];
        String[] output = toExtract.split("\\.");
        System.out.println("File name: " + output[0]);
        System.out.println("File extension: " + output[1]);
    }
}
