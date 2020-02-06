package JavaFundamentals.ExamsPreparation.FinalExams.FinalExam03AugustGroup2;

import java.util.Scanner;

public class StringManipulatorGroup2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            if (command.equals("Change")) {
                String change = tokens[1];
                String replace = tokens[2];
                text = text.replaceAll(change, replace);
                System.out.println(text);
            } else if (command.equals("Includes")) {
                String include = tokens[1];
                if (text.contains(include)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            } else if (command.equals("End")) {
                String ends = tokens[1];
                if (text.endsWith(ends)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            } else if (command.contains("Uppercase")) {
                text = text.toUpperCase();
                System.out.println(text);
            } else if (command.equals("FindIndex")) {
                String symbol = tokens[1];
                int index = text.indexOf(symbol);
                System.out.println(index);
            } else if (command.equals("Cut")) {
                StringBuilder fromString = new StringBuilder(text);
                int firstIndex = Integer.parseInt(tokens[1]);
                int secondIndex = Integer.parseInt(tokens[2]);
                fromString.delete(0, firstIndex);
                fromString.delete(secondIndex, fromString.length());
                text = fromString.toString();
                System.out.println(text);
            }
            input = scanner.nextLine();
        }
    }
}
