package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class ComputerRoom_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mounts = scanner.nextLine();
        int hours = Integer.parseInt(scanner.nextLine());
        int peopleNumber = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();
        double price;
        if (mounts.equals("march") || mounts.equals("april") || mounts.equals("may")) {
            if (time.equals("day")) {
                price = hours * 10.50;
            } else {
                price = hours * 8.40;
            }
        } else {
            if (time.equals("day")) {
                price = hours * 12.60;
            } else {
                price = hours * 10.20;
            }
        }
        double finalPrice = price * peopleNumber;
        if (peopleNumber >= 4) {
            finalPrice = finalPrice - finalPrice * 0.10;
        }
        if (hours >= 5) {
            finalPrice = finalPrice / 2;
        }
        System.out.printf("Price per person for one hour: %.2f%n", finalPrice / peopleNumber / hours);
        System.out.printf("Total cost of the visit: %.2f", finalPrice);
    }
}
