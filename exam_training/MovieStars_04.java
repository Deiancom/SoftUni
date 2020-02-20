package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class MovieStars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        while (!input.equals("ACTION")) {
            if (input.length() <= 15) {
                double money = Double.parseDouble(scanner.nextLine());
                    budget -= money;
                } else {
                    budget -= budget * 0.20;
                }
            if (budget < 0) {
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("ACTION")) {
            System.out.printf("We are left with %.2f leva.",budget);
        } else {
            System.out.printf("We need %.2f leva for our actors.", Math.abs(budget));
        }

    }
}
