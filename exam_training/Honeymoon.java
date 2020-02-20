package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class Honeymoon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        int nightsCount = Integer.parseInt(scanner.nextLine());
        double price;
        double discount = 0;
        switch (destination) {
            case "Cairo":
                price = (500 * nightsCount) + 600;
                break;
            case "Paris":
                price = 300 * nightsCount + 350;
                break;
            case "Lima":
                price = 800 * nightsCount + 850;
                break;
            case "New York":
                price = 600 * nightsCount + 650;
                break;
            default:
                price = 700 * nightsCount + 700;
                break;
        }
        if (nightsCount >= 1 && nightsCount <= 4) {
            if (destination.equals("Cairo") || destination.equals("New York")) {
                discount = price * 0.03;
            }
        } else if (nightsCount >= 5 && nightsCount <= 9) {
            if (destination.equals("Cairo") || destination.equals("New York")) {
                discount = price * 0.05;
            } else if (destination.equals("Paris")) {
                discount = price * 0.07;
            }
        } else if (nightsCount >= 10 && nightsCount <= 24) {
            if (destination.equals("Cairo")) {
                discount = price * 0.10;
            } else if (destination.equals("Paris") || destination.equals("New York") || destination.equals("Tokyo")) {
                discount = price * 0.12;
            }
        } else if (nightsCount >= 25 && nightsCount <= 49) {
            if (destination.equals("Tokyo") || destination.equals("Cairo")) {
                discount = price * 0.17;
            } else if (destination.equals("New York") || destination.equals("Lima")) {
                discount = price * 0.19;
            } else {
                discount = price * 0.22;
            }
        } else {
            discount = price * 0.30;
        }
        double finalPrice = price - discount;
        if (budget >= finalPrice) {
            System.out.printf("Yes! You have %.2f leva left.", budget - finalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(finalPrice - budget));
        }
    }
}
