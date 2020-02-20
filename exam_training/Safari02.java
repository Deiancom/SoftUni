package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class Safari02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double fuelNeeded = Double.parseDouble(scanner.nextLine()) * 2.10;
        String dayOfWeekend = scanner.nextLine();
        double price = fuelNeeded + 100;

        if (dayOfWeekend.equals("Saturday")) {
            price -= price * 0.10;
        } else {
            price -= price * 0.20;
        }
        if (budget >= price) {
            System.out.printf("Safari time! Money left: %.2f lv.", budget - price);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", price - budget);
        }

    }
}
