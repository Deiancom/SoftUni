package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class Club_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double desireProfit = Double.parseDouble(scanner.nextLine());

        double profit = 0;
        while (desireProfit > profit) {
            String input = scanner.nextLine();
            if (input.equals("Party!")) {
                System.out.printf("We need %.2f leva more.%n", desireProfit - profit);
                System.out.printf("Club income - %.2f leva.", profit);
                break;
            }
            int nameLength = input.length();
            int cocktailsCount = Integer.parseInt(scanner.nextLine());
            int checker = nameLength * cocktailsCount;

            if (!(checker % 2 == 0)) {
                profit += checker - checker * 0.25;
            } else {
                profit += nameLength * cocktailsCount;
            }

        }
        if (desireProfit <= profit) {
            System.out.println("Target acquired.");
            System.out.printf("Club income - %.2f leva.", profit);
        }
    }
}
