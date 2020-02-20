package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class CoffeeMachine_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int numberOfDrinks = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (drink) {
            case "Espresso":
                switch (sugar) {
                    case "Without":
                        price = 0.90 * numberOfDrinks;
                        break;
                    case "Normal":
                        price = 1.00 * numberOfDrinks;
                        break;
                    case "Extra":
                        price = 1.20 * numberOfDrinks;
                        break;
                }
                break;
            case "Cappuccino":
                switch (sugar) {
                    case "Without":
                        price = 1.00 * numberOfDrinks;
                        break;
                    case "Normal":
                        price = 1.20 * numberOfDrinks;
                        break;
                    case "Extra":
                        price = 1.60 * numberOfDrinks;
                        break;
                }
                break;
            case "Tea":
                switch (sugar) {
                    case "Without":
                        price = 0.50 * numberOfDrinks;
                        break;
                    case "Normal":
                        price = 0.60 * numberOfDrinks;
                        break;
                    case "Extra":
                        price = 0.70 * numberOfDrinks;
                        break;
                }
                break;
        }
        if (sugar.equals("Without")) {
            price = price - price * 0.35;
        }
        if (drink.equals("Espresso") && numberOfDrinks >= 5) {
            price = price - price * 0.25;
        }
        if (price > 15) {
            price = price - price * 0.20;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.", numberOfDrinks, drink, price);
    }
}
