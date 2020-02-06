package JavaFundamentals.MapsLambdaStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MOBAChallenger03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> playerAndSum = new LinkedHashMap<>();
        Map<String, Map<String, Integer>> nameGameSkill = new LinkedHashMap<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Season end")) {
                break;
            }
            if (input.contains("->")) {
                String[]command = input.split(" -> ");
                String name = command[0];
                String game = command[1];
                int skill = Integer.parseInt(command[2]);
                nameGameSkill.putIfAbsent(name, new LinkedHashMap<>());
                nameGameSkill.get(name).putIfAbsent(game, -1);
                if (nameGameSkill.get(name).get(game) < skill) {
                    nameGameSkill.get(name).put(game, skill);
                }
            } else {
                String[] command = input.split(" vs ");
                String firstName = command[0];
                String secondName = command[1];
                if (nameGameSkill.containsKey(firstName) && nameGameSkill.containsKey(secondName)) {

                }
            }
        }
    }
}
