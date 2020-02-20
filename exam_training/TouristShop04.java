package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class TouristShop04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double sum = 0;
        int products = 0;
        int count = 0;
        while (!input.equals("Stop")) {
            count++;
            double price = Double.parseDouble(scanner.nextLine());
            if (count % 3 == 0) {
                price /= 2;
            }
            if (price > budget) {
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.2f leva!", (price - budget));
                return;
            }
            sum += price;
            budget -= price;
            products++;

            input = scanner.nextLine();
        }
        System.out.printf("You bought %d products for %.2f leva.", products, sum);
    }
}
