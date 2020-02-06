package JavaFundamentals.FinalExam;

import java.util.Scanner;

public class NikuldenCharity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Finish")) {
                break;
            }
            String[] command = input.split("\\s+");
            if (command[0].equals("Replace")) {
                char a = command[1].charAt(0);
                char b = command[2].charAt(0);
                string = string.replace(a, b);
                System.out.println(string);
            } else if (command[0].equals("Cut")) {
                int startIndex = Integer.parseInt(command[1]);
                int endIndex = Integer.parseInt(command[2]);

                if (startIndex >= string.length() || startIndex < 0 || endIndex < 0 || endIndex >= string.length()) {
                    System.out.println("Invalid indexes!");
                } else {
                    StringBuilder text = new StringBuilder();
                    text.append(string);
                    text.delete(startIndex , endIndex + 1);
                    System.out.println(text);
                    string = text.toString();
                }
            } else if (command[0].equals("Make")) {
                String toUpOrLow = command[1];
                if (toUpOrLow.equals("Upper")) {
                    string = string.toUpperCase();
                } else {
                    string = string.toLowerCase();
                }
                System.out.println(string);
            } else if (command[0].equals("Check")) {
                String toCheck = command[1];
                if (string.contains(toCheck)) {
                    System.out.printf("Message contains %s%n", toCheck);
                } else {
                    System.out.printf("Message doesn't contain %s%n", toCheck);
                }
            } else if (command[0].contains("Sum")) {
                int startIndex = Integer.parseInt(command[1]);
                int endIndex = Integer.parseInt(command[2]);
                if (startIndex >= string.length() || startIndex < 0 || endIndex < 0 || endIndex >= string.length()) {
                    System.out.println("Invalid indexes!");
                } else {
                    int sum = 0;
                    for (int i = startIndex; i <= endIndex ; i++) {
                        sum += string.charAt(i);

                    }
                    System.out.println(sum);
                }
            }
        }
    }
}
