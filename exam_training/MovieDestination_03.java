package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class MovieDestination_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double price = 0;
        if (destination.equals("Dubai")) {
            if (season.equals("Winter")) {
                price = 45000 * days;
                price = price - price * 0.30;
            } else {
                price = 40000 * days;
                price = price - price * 0.30;
            }
        } else if (destination.equals("Sofia")) {
            if (season.equals("Winter")) {
                price = 17000 * days;
                price = price + price * 0.25;
            } else {
                price = 12500 * days;
                price = price + price * 0.25;
            }
        } else {
            if (season.equals("Winter")) {
                price = 24000 * days;
            } else {
                price = 20250 * days;
            }
        }
        if (budget >= price) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget - price);
        } else {
            System.out.printf("The director needs %.2f leva more!",price - budget);
        }
    }
}
