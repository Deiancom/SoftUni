package JavaAdvance.Defining_Classes.Exercises.car_salesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Engine> enginesList = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String model = tokens[0];
            String power = tokens[1];
            String displacement = "n/a";
            String efficiency = "n/a";
            if (tokens.length == 3) {
                if (Character.isDigit(tokens[2].charAt(0))) {
                    displacement = tokens[2];
                } else {
                    efficiency = tokens[2];
                }
            } else if (tokens.length == 4) {
                displacement = tokens[2];
                efficiency = tokens[3];
            }
            Engine engine = new Engine(model, power);
            engine.setDisplacement(displacement);
            engine.setEfficiency(efficiency);
            enginesList.put(model, engine);
        }
        int m = Integer.parseInt(scanner.nextLine());
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String model = tokens[0];
            String engineName = tokens[1];
            String weight = "n/a";
            String color = "n/a";
            if (tokens.length == 3) {
                if (Character.isDigit(tokens[2].charAt(0))) {
                    weight = tokens[2];
                } else {
                    color = tokens[2];
                }
            } else if (tokens.length == 4) {
                weight = tokens[2];
                color = tokens[3];
            }

            Car car = new Car(model, enginesList.get(engineName));
            car.setWeight(weight);
            car.setColor(color);
            carList.add(car);
        }
        carList.forEach(System.out::println);
    }
}
