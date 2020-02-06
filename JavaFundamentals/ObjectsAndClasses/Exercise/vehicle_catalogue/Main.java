package JavaFundamentals.ObjectsAndClasses.Exercise.vehicle_catalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<VehicleCatalogue> info = new ArrayList<>();
        while (!input.equals("End")) {
            String[] tokens = input.split(" ");
            String type = tokens[0];
            String model = tokens[1];
            String color = tokens[2];
            int horsepower = Integer.parseInt(tokens[3]);
            VehicleCatalogue vehicleCatalogue = new VehicleCatalogue(type, model, color, horsepower);
            vehicleCatalogue.setTypeOfVehicle(type);
            vehicleCatalogue.setModel(model);
            vehicleCatalogue.setColor(color);
            vehicleCatalogue.setHorsepower(horsepower);
            info.add(vehicleCatalogue);
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("Close the Catalogue")) {
            String finalInput = input;
            info.stream().filter(m -> m.getModel().equals(finalInput))
                    .forEach(System.out::println);
            input = scanner.nextLine();
        }
        double carAverage = info.stream().filter(t -> t.getTypeOfVehicle().equals("car")).mapToDouble(VehicleCatalogue::getHorsepower)
                .average().orElse(0.0);
        double truckAverage = info.stream().filter(t -> t.getTypeOfVehicle().equals("truck")).mapToDouble(VehicleCatalogue::getHorsepower)
                .average().orElse(0.0);
        System.out.printf("Cars have average horsepower of: %.2f.%n", carAverage);
        System.out.printf("Trucks have average horsepower of: %.2f.", truckAverage);
    }
}
