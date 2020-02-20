package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class ChristmasDecoration_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String item = scanner.nextLine();
        while (!item.contains("Stop")) {
            int sum = 0;
            for (int i = 0; i < item.length(); i++) {
                sum = sum + item.charAt(i);
            }
            budget -= sum;
            if (budget >= 0) {
                System.out.println("Item successfully purchased!");
            } else {
                System.out.println("Not enough money!");
                return;
            }
            item = scanner.nextLine();
        }
        System.out.printf("Money left: %d", budget);
    }
}

