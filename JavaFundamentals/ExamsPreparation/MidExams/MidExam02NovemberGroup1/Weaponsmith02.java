package JavaFundamentals.ExamsPreparation.MidExams.MidExam02NovemberGroup1;

import java.util.*;
import java.util.stream.Collectors;

public class Weaponsmith02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> weaponList = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Done")) {
                break;
            }
            String[] command = input.split(" ");
            switch (command[1]) {
                case "Left": {
                    int index = Integer.parseInt(command[2]);
                    if (index > 0 && index < weaponList.size()) {
                        String backup = weaponList.get(index - 1);
                        weaponList.remove(index - 1);
                        weaponList.add(index, backup);
                    }
                    break;
                }
                case "Right": {
                    int index = Integer.parseInt(command[2]);
                    if (index >= 0 && index < weaponList.size() - 1) {
                        String backup = weaponList.get(index);
                        weaponList.remove(index);
                        weaponList.add(index + 1, backup);
                    }
                    break;
                }
                case "Even":
                    for (int i = 0; i < weaponList.size(); i++) {
                        if (i % 2 == 0) {
                            System.out.print(weaponList.get(i) + " ");
                        }
                    }
                    System.out.println();
                    break;
                case "Odd":
                    for (int i = 0; i < weaponList.size(); i++) {
                        if (i % 2 != 0) {
                            System.out.print(weaponList.get(i) + " ");
                        }
                    }
                    System.out.println();
                    break;
            }
        }
        StringBuilder toPrint = new StringBuilder();
        for (String s : weaponList) {
            toPrint.append(s);
        }
        System.out.println("You crafted " + toPrint + "!");
    }
}
