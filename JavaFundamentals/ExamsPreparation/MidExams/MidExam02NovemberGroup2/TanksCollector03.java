package JavaFundamentals.ExamsPreparation.MidExams.MidExam02NovemberGroup2;

import java.util.*;
import java.util.stream.Collectors;

public class TanksCollector03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tanksList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        int commandCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < commandCount; i++) {
            String[] tokens = scanner.nextLine().split(", ");
            switch (tokens[0]) {
                case "Add":
                    if (tanksList.contains(tokens[1])) {
                        System.out.println("Tank is already bought");
                    } else {
                        System.out.println("Tank successfully bought");
                        tanksList.add(tokens[1]);
                    }
                    break;
                case "Remove":
                    if (tanksList.contains(tokens[1])) {
                        System.out.println("Tank successfully sold");
                        tanksList.remove(tokens[1]);
                    } else {
                        System.out.println("Tank not found");
                    }
                    break;
                case "Remove At": {
                    int index = Integer.parseInt(tokens[1]);
                    if (index >= 0 && index < tanksList.size()) {
                        tanksList.remove(index);
                        System.out.println("Tank successfully sold");
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;
                }
                case "Insert": {
                    int index = Integer.parseInt(tokens[1]);
                    if (index >= 0 && index < tanksList.size()) {
                        if (tanksList.contains(tokens[2])) {
                            System.out.println("Tank is already bought");
                        } else {
                            System.out.println("Tank successfully bought");
                            tanksList.add(index, tokens[2]);
                        }
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;
                }
            }
        }
        for (int i = 0; i < tanksList.size(); i++) {
            if (i < tanksList.size() - 1) {
                System.out.print(tanksList.get(i) + ", ");
            } else {
                System.out.println(tanksList.get(i));
            }
        }
    }
}