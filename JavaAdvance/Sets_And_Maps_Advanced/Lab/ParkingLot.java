package JavaAdvance.Sets_And_Maps_Advanced.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String input = rd.readLine();
        Set<String> licensePlate = new LinkedHashSet<>();
        while (!input.equals("END")) {
            String[] commands = input.split(", ");
            String direction = commands[0];
            String carLicensePlate = commands[1];
            switch (direction) {
                case "IN":
                    licensePlate.add(carLicensePlate);
                    break;
                case "OUT":
                    licensePlate.remove(carLicensePlate);
                    break;
            }
            input = rd.readLine();
        }
        if (licensePlate.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            licensePlate.forEach(System.out::println);
        }
    }
}
