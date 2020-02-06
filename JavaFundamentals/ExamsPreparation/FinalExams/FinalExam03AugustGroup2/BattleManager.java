package JavaFundamentals.ExamsPreparation.FinalExams.FinalExam03AugustGroup2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BattleManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> nameHealth = new HashMap<>();
        Map<String, Integer> nameEnergy = new HashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("Results")) {
            String[] tokens = input.split(":");
            String command = tokens[0];
            String userName = tokens[1];
            switch (command) {
                case "Add":
                    int health = Integer.parseInt(tokens[2]);
                    int energy = Integer.parseInt(tokens[3]);
                    if (nameHealth.containsKey(userName)) {
                        int currentHealth = nameHealth.get(userName);
                        nameEnergy.put(userName, currentHealth + health);
                    } else {
                        nameHealth.put(userName, health);
                        nameEnergy.put(userName, energy);
                    }
                    break;
                case "Attack":
                    String defend = tokens[2];
                    int damage = Integer.parseInt(tokens[3]);
                    if (nameHealth.containsKey(userName) && nameHealth.containsKey(defend)) {
                        int defenderHealth = nameHealth.get(defend);
                        defenderHealth -= damage;
                        nameHealth.put(defend, defenderHealth);
                        if (defenderHealth <= 0) {
                            nameHealth.remove(defend);
                            nameEnergy.remove(defend);
                            System.out.printf("%s was disqualified!%n", defend);
                        }
                        int attackerEnergy = nameEnergy.get(userName);
                        attackerEnergy -= 1;
                        nameEnergy.put(userName, attackerEnergy);
                        if (attackerEnergy <= 0) {
                            nameHealth.remove(userName);
                            nameEnergy.remove(userName);
                            System.out.printf("%s was disqualified!%n", userName);
                        }
                    }
                    break;
                case "Delete":
                    if (userName.equals("All")) {
                        nameHealth.clear();
                        nameEnergy.clear();
                    } else {
                        nameHealth.remove(userName);
                        nameEnergy.remove(userName);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("People count: " + nameHealth.size());
        nameHealth.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue()
                .reversed().thenComparing(Map.Entry::getKey))
                .forEach(entry -> {
                    int energy = nameEnergy.get(entry.getKey());
                    System.out.println(String.format("%s - %d - %d", entry.getKey(), entry.getValue(), energy));
                });
    }
}
