package JavaFundamentals.ExamsPreparation.FinalExams.FinalExam03AugustGroup1;

import java.util.Scanner;

public class StringManipulatorGroup1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Translate":
                    String toChar = tokens[1];
                    String replace = tokens[2];
                    if (text.contains(toChar)) {
                        text = text.replaceAll(toChar, replace);
                        System.out.println(text);
                    }
                    break;
                case "Includes":
                    String includes = tokens[1];
                    if (text.contains(includes)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Start":
                    String startWith = tokens[1];
                    if (text.startsWith(startWith)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Lowercase":
                    text = text.toLowerCase();
                    System.out.println(text);
                    break;
                case "FindIndex":
                    String lastIndex = tokens[1];
                    int index = text.lastIndexOf(lastIndex);
                    System.out.println(index);
                    break;
                case "Remove":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int count = Integer.parseInt(tokens[2]);
                    StringBuilder stringText = new StringBuilder();
                    stringText.append(text);
                    stringText.delete(startIndex, count);
                    System.out.println(stringText);
                    break;
            }
        }
    }
}
