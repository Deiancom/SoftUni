package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class SushiTime_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sushiName = scanner.nextLine();
        String restaurant = scanner.nextLine();
        int numPortions = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();
        double price = 0;
        boolean isValid = true;
        switch (restaurant) {
            case ("Sushi Zone"):
                if (sushiName.equals("sashimi")) {
                    price = numPortions * 4.99;
                } else if (sushiName.equals("maki")) {
                    price = numPortions * 5.29;
                } else if (sushiName.equals("uramaki")) {
                    price = numPortions * 5.99;
                } else if (sushiName.equals("temaki")) {
                    price = numPortions * 4.29;
                }
                break;
            case ("Sushi Time"):
                if (sushiName.equals("sashimi")) {
                    price = numPortions * 5.49;
                } else if (sushiName.equals("maki")) {
                    price = numPortions * 4.69;
                } else if (sushiName.equals("uramaki")) {
                    price = numPortions * 4.49;
                } else if (sushiName.equals("temaki")) {
                    price = numPortions * 5.19;
                }
                break;
            case ("Sushi Bar"):
                if (sushiName.equals("sashimi")) {
                    price = numPortions * 5.25;
                } else if (sushiName.equals("maki")) {
                    price = numPortions * 5.55;
                } else if (sushiName.equals("uramaki")) {
                    price = numPortions * 6.25;
                } else if (sushiName.equals("temaki")) {
                    price = numPortions * 4.75;
                }
                break;
            case ("Asian Pub"):
                if (sushiName.equals("sashimi")) {
                    price = numPortions * 4.50;
                } else if (sushiName.equals("maki")) {
                    price = numPortions * 4.80;
                } else if (sushiName.equals("uramaki")) {
                    price = numPortions * 5.50;
                } else if (sushiName.equals("temaki")) {
                    price = numPortions * 5.50;
                }
                break;
            default:
                isValid = false;
                System.out.printf("%s is invalid restaurant!", restaurant);
                break;
        }
        if (symbol.equals("Y")) {
            price += 0.20 * price;
        }
        if (isValid) {
            System.out.printf("Total price: %.0f lv.", Math.ceil(price));
        }
    }
}
