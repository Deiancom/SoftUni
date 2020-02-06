package JavaFundamentals.MapsLambdaStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        Map<String, String> namesAndPlates = new LinkedHashMap<>();

        for (int i = 0; i < number ; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String command = tokens[0];
            String name = tokens[1];

            if (command.equals("register")) {
                String plate = tokens[2];
                if (namesAndPlates.containsKey(name)) {
                    System.out.printf("ERROR: already registered with plate number %s%n", namesAndPlates.get(name));
                } else {
                    namesAndPlates.put(name, plate);
                    System.out.printf("%s registered %s successfully%n", name, plate);
                }
            } else {
                if (namesAndPlates.containsKey(name)) {
                    System.out.printf("%s unregistered successfully%n", name);
                    namesAndPlates.remove(name);
                } else {
                    System.out.printf("ERROR: user %s not found%n", name);
                }
            }
        }
        for (Map.Entry<String, String> entry : namesAndPlates.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }

    }
}
