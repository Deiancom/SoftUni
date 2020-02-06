package JavaFundamentals.ExamsPreparation.MidExams.MidExamRetake06August;

import java.util.*;
import java.util.stream.Collectors;

public class TreasureHunt02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> treasureChest = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Yohoho!")) {
                break;
            }
            String[] command = input.split(" ");
            switch (command[0]) {
                case "Loot":
                    for (int i = 1; i < command.length; i++) {
                        if (!treasureChest.contains(command[i])) {
                            treasureChest.add(0, command[i]);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(command[1]);
                    if (index >= 0 && index < treasureChest.size()) {
                        String backup = treasureChest.get(index);
                        treasureChest.add(backup);
                        treasureChest.remove(index);
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(command[1]);
                    if ( count > treasureChest.size()) {
                        count = treasureChest.size();
                    }
                    List<String> backupList = new ArrayList<>();
                    for (int i = treasureChest.size() - count; i < treasureChest.size(); i++) {
                        backupList.add(treasureChest.get(i));
                        if (i < treasureChest.size() - 1) {
                            System.out.print(treasureChest.get(i) + ", ");
                        } else {
                            System.out.print(treasureChest.get(i));
                        }

                    }
                    System.out.println();
                    treasureChest.removeAll(backupList);
                    break;

            }
        }
        double sumFromList = 0;
        for (String sum : treasureChest) {
            sumFromList += sum.length();
        }
        double finalSum = sumFromList / treasureChest.size();
        if (treasureChest.isEmpty()) {
            System.out.print("Failed treasure hunt.");
        } else {
            System.out.printf("Average treasure gain: %.2f pirate credits.", finalSum);
        }
    }
}
