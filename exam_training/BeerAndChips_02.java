package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class BeerAndChips_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        double beerNumber = Double.parseDouble(scanner.nextLine());
        int chipsNumber = Integer.parseInt(scanner.nextLine());

        double beerPrice = beerNumber * 1.20;
        double packageOfChips = beerPrice * 0.45;
        double chipsPrice = Math.ceil(packageOfChips * chipsNumber);
        double finalPrice = chipsPrice + beerPrice;
        if (finalPrice <= budget) {
            System.out.printf("%s bought a snack and has %.2f leva left.", name, budget - finalPrice);
        } else {
            System.out.printf("%s needs %.2f more leva!", name, finalPrice - budget);
        }
    }
}
