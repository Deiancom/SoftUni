package JavaFundamentals.ExamsPreparation.FinalExams.FinalExamRetake09August;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Username01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        List<Character> userName = new ArrayList<>();
        for (int i = 0; i < name.length(); i++) {
            userName.add(name.charAt(i));
        }
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Sign up")) {
                break;
            }
            String[] command = input.split("\\s+");
            if (command[1].equals("lower")) {
                name = name.toLowerCase();
                System.out.println(name);
            } else if (command[1].equals("upper")) {
                name = name.toUpperCase();
                System.out.println(name);
            } else if (command[0].equals("Reverse")) {
                int startIndex = Integer.parseInt(command[1]);
                int endIndex = Integer.parseInt(command[2]);
                StringBuilder toReverse = new StringBuilder();
                if (startIndex >= 0 && startIndex < endIndex && endIndex < userName.size()) {
                    for (int i = startIndex; i <= endIndex; i++) {
                        toReverse.append(userName.get(i));
                    }
                    System.out.println(toReverse.reverse());
                }
            } else if (command[0].equals("Cut")) {
                String cut = command[1];
                if (name.contains(cut)) {
                    name = name.replace(cut, "");
                    System.out.println(name);
                } else {
                    System.out.printf("The word %s doesn't contain %s.%n", name, cut);
                }
            } else if (command[0].equals("Replace")) {
                String replace = command[1];
                name = name.replaceAll(replace, "*");
                System.out.println(name);
            } else if (command[0].equals("Check")) {
                String check = command[1];
                if (name.contains(check)) {
                    System.out.println("Valid");
                } else {
                    System.out.printf("Your username must contain %s.", check);
                }
            }
        }
    }
}
