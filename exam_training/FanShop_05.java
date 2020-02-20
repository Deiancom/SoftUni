package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class FanShop_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        int itemNumber = Integer.parseInt(scanner.nextLine());
        int price = 0;
        for (int i = 0; i < itemNumber; i++) {
            String itemName = scanner.nextLine();
            switch (itemName) {
                case "hoodie":
                    price += 30;
                    break;
                case "keychain":
                    price += 4;
                    break;
                case "T-shirt":
                    price += 20;
                    break;
                case "flag":
                    price += 15;
                    break;
                case "sticker":
                    price += 1;
                    break;
            }
        }
        if (budget >= price) {
            System.out.printf("You bought %d items and left with %d lv.", itemNumber, budget - price);
        } else {
            System.out.printf("Not enough money, you need %d more lv.", price - budget);
        }
    }
}
