package JavaFundamentals.ExamsPreparation.MidExams.MidExamRetake06August;

import java.util.*;
import java.util.stream.Collectors;

public class ManOWar03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pirateShip = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> warship = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxHealth = Integer.parseInt(scanner.nextLine());
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Retire")) {
                break;
            }
            String[] command = input.split("\\s+");
            switch (command[0]) {
                case "Fire": {
                    int index = Integer.parseInt(command[1]);
                    int damage = Integer.parseInt(command[2]);
                    if (index >= 0 && index < warship.size()) {
                        int sectionHealth = warship.get(index);
                        sectionHealth -= damage;
                        if (sectionHealth <= 0) {
                            System.out.print("You won! The enemy ship has sunken.");
                            return;
                        } else {
                            warship.set(index, sectionHealth);
                        }
                    }
                    break;
                }
                case "Defend": {
                    int startIndex = Integer.parseInt(command[1]);
                    int endIndex = Integer.parseInt(command[2]);
                    int damage = Integer.parseInt(command[3]);
                    if (startIndex >= 0 && startIndex < endIndex && endIndex < pirateShip.size()) {
                        for (int i = startIndex; i <= endIndex; i++) {
                            int sectionHealth = pirateShip.get(i);
                            sectionHealth -= damage;
                            if (sectionHealth <= 0) {
                                System.out.print("You lost! The pirate ship has sunken.");
                                return;
                            } else {
                                pirateShip.set(i, sectionHealth);
                            }
                        }
                    }
                    break;
                }
                case "Repair": {
                    int index = Integer.parseInt(command[1]);
                    int health = Integer.parseInt(command[2]);
                    if (index >= 0 && index < pirateShip.size()) {
                        int sectionHealth = pirateShip.get(index);
                        if (sectionHealth + health > maxHealth) {
                            sectionHealth = maxHealth;
                        } else {
                            sectionHealth += health;
                        }
                        pirateShip.set(index, sectionHealth);
                    }
                    break;
                }
                case "Status":
                    double percent = maxHealth - maxHealth * 0.80;
                    int counter = 0;
                    for (Integer integer : pirateShip) {
                        if (integer < percent) {
                            counter++;
                        }
                    }
                    System.out.printf("%d sections need repair.%n", counter);
                    break;
            }
        }
        int pirateShipSum = 0;
        int warshipSum = 0;
        for (Integer integer : pirateShip) {
            pirateShipSum += integer;
        }
        for (Integer integer : warship) {
            warshipSum += integer;
        }
        System.out.printf("Pirate ship status: %d%n", pirateShipSum);
        System.out.printf("Warship status: %d", warshipSum);
    }
}
