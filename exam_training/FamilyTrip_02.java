package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class FamilyTrip_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int nightNumber = Integer.parseInt(scanner.nextLine());
        double nightPrice = Double.parseDouble(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());
        double priceNights = nightNumber * nightPrice;
        if (nightNumber > 7) {
            priceNights = priceNights - priceNights * 0.05;
        }
        double otherExpenses = budget * percent / 100;
        double totalExpenses = priceNights + otherExpenses;
        if (totalExpenses <= budget) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - totalExpenses);
        } else {
            System.out.printf("%.2f leva needed.", totalExpenses - budget);
        }
    }
}
