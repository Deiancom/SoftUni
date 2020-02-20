package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class WeddingTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guestCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        int cuvertPrice = guestCount * 20;
        if (budget < cuvertPrice) {
            System.out.printf("They won't have enough money to pay the covert. They will need %d lv more.", Math.abs(budget - cuvertPrice));

        }else {
            double moneyLeft = budget - cuvertPrice;
            double forFireworks = moneyLeft * 0.40;
            double moneyForDonation = moneyLeft - forFireworks;
            System.out.printf("Yes! %.0f lv are for fireworks and %.0f lv are for donation.",forFireworks,moneyForDonation);
        }
    }
}
