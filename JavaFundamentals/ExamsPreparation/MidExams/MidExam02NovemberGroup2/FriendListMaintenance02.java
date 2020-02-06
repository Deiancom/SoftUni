package JavaFundamentals.ExamsPreparation.MidExams.MidExam02NovemberGroup2;

import java.util.*;
import java.util.stream.Collectors;

public class FriendListMaintenance02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = Arrays.stream(scanner.nextLine().split(",\\s+")).collect(Collectors.toList());
        int blackListedNames = 0;
        int lostNames = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Report")) {
                break;
            }
            String[] command = input.split("\\s+");
            switch (command[0]) {
                case "Blacklist":
                    if (names.contains(command[1])) {
                        blackListedNames++;
                        System.out.printf("%s was blacklisted.%n", command[1]);
                        names.set(names.indexOf(command[1]), "Blacklisted");
                    } else {
                        System.out.printf("%s was not found.%n", command[1]);
                    }
                    break;
                case "Error": {
                    int index = Integer.parseInt(command[1]);
                    if (!names.get(index).equals("Blacklisted") && !names.get(index).equals("Lost")) {
                        String name = names.get(index);
                        lostNames++;
                        System.out.printf("%s was lost due to an error.%n", names.get(index));
                        names.set(names.indexOf(name), "Lost");
                    }
                    break;
                }
                case "Change": {
                    int index = Integer.parseInt(command[1]);
                    if (index >= 0 && index < names.size()) {
                        String name = names.get(index);
                        names.set(names.indexOf(name), command[2]);
                        System.out.printf("%s changed his username to %s.%n", name, command[2]);
                    }
                    break;
                }
            }
        }
        System.out.printf("Blacklisted names: %d%n", blackListedNames);
        System.out.printf("Lost names: %d%n", lostNames);
        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}
