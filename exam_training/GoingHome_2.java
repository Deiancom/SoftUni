package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class GoingHome_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distance = Double.parseDouble(scanner.nextLine());
        int fuelPerKm = Integer.parseInt(scanner.nextLine());
        double fuelPricePerLiter = Double.parseDouble(scanner.nextLine());
        int moneyIncome = Integer.parseInt(scanner.nextLine());

        double carConsumation = distance * fuelPerKm / 100;
        double sumForFuel = carConsumation * fuelPricePerLiter;
        if (moneyIncome >= sumForFuel) {
            System.out.printf("You can go home. %.2f money left.", moneyIncome - sumForFuel);
        } else {
            System.out.printf("Sorry, you cannot go home. Each will receive %.2f money.", moneyIncome / 5.0);
        }
    }
}
