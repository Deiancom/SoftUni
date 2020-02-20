package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class WeddingDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double total = 0;
        double price = 0;
        int balloons = 0;
        int flowers = 0;
        int candles = 0;
        int ribbon = 0;

        while (budget > 0) {
            String inpt = scanner.nextLine();
            if (!inpt.equalsIgnoreCase("stop")) {
                String prdct = inpt;
                int counter = Integer.parseInt(scanner.nextLine());
                if (prdct.equalsIgnoreCase("balloons")) {
                    price = counter * 0.1;
                    balloons += counter;
                }
                if (prdct.equalsIgnoreCase("flowers")) {
                    price = counter * 1.5;
                    flowers += counter;
                }
                if (prdct.equalsIgnoreCase("candles")) {
                    price = counter * 0.5;
                    candles += counter;
                }
                if (prdct.equalsIgnoreCase("ribbon")) {
                    price = counter * 2;
                    ribbon += counter;
                }
                total += price;
                budget -= price;
            } else {
                break;
            }
        }

        if (budget > 0) {
            System.out.printf("Spend money: %.2f\nMoney left: %.2f\n", total, budget);
        } else {
            System.out.printf("All money is spent!\n");
        }

        System.out.printf("Purchased decoration is %d balloons, %d m ribbon, %d flowers and %d candles.", balloons, ribbon, flowers, candles);

    }
}

