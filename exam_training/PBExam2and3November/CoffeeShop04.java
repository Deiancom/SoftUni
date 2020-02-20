package ProgrammingBasics.exam_training.PBExam2and3November;

import java.util.Scanner;

public class CoffeeShop04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coffeeInGrams = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        while (coffeeInGrams > 0) {
            String command = scanner.nextLine();
            if (caseCoffeeClosed(coffeeInGrams, sum, command)) return;
            switch (command) {
                case "espresso":
                    if (coffeeInGrams >= 50) {
                        sum += 3;
                        coffeeInGrams -= 50;
                    } else {
                        System.out.println("Not enough coffee!");
                    }
                    break;
                case "cappuccino":
                    if (coffeeInGrams >= 30) {
                        sum += 3.50;
                        coffeeInGrams -= 30;
                    } else {
                        System.out.println("Not enough coffee!");
                    }
                    break;
                case "latte":
                    if (coffeeInGrams >= 20) {
                        sum += 3.50;
                        coffeeInGrams -= 20;
                    } else {
                        System.out.println("Not enough coffee!");
                    }
                    break;
            }
        }
        System.out.println("No more coffee left!");
        System.out.printf("Profit: %.2f lv.", sum);
    }

    private static boolean caseCoffeeClosed(int coffeeInGrams, double sum, String command) {
        if (command.equals("closed")) {
            System.out.printf("Coffee left: %dg%n", coffeeInGrams);
            System.out.printf("Profit: %.2f lv.", sum);
            return true;
        }
        return false;
    }
}
