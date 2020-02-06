package JavaFundamentals.ObjectsAndClasses.Exercise.raw_data;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> fragile = new ArrayList<>();
        Map<String, Integer> flamable = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split(" ");
            String name = info[0];
            int enginePower = Integer.parseInt(info[2]);
            String type = info[4];
            if (type.equals("fragile")) {
                double tyre1Pressure = Double.parseDouble(info[5]);
                double tyre2Pressure = Double.parseDouble(info[7]);
                double tyre3Pressure = Double.parseDouble(info[9]);
                double tyre4Pressure = Double.parseDouble(info[11]);
                if (tyre1Pressure < 1 || tyre2Pressure < 1 || tyre3Pressure < 1 || tyre4Pressure < 1) {
                    fragile.add(name);
                }

            } else {
                flamable.put(name, enginePower);
            }
        }
        String commandType = scanner.nextLine();
        if (commandType.equals("fragile")) {
            fragile.forEach(key -> System.out.printf("%s", key));

        } else {
            flamable.entrySet().stream().filter(p -> p.getValue() > 250)
                    .forEach(e -> System.out.println(e.getKey()));
        }
    }
}

