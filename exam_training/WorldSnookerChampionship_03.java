package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class WorldSnookerChampionship_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stage = scanner.nextLine();
        String ticketType = scanner.nextLine();
        int ticketNum = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();

        double ticketPrice = 0;

        if ("Quarter final".equals(stage)) {
            if (ticketType.equals("Standard")) {
                ticketPrice = 55.50;
            } else if (ticketType.equals("Premium")) {
                ticketPrice = 105.20;
            } else {
                ticketPrice = 118.90;
            }
        } else if ("Semi final".equals(stage)) {
            if (ticketType.equals("Standard")) {
                ticketPrice = 75.88;
            } else if (ticketType.equals("Premium")) {
                ticketPrice = 125.22;
            } else {
                ticketPrice = 300.40;
            }
        } else if ("Final".equals(stage)) {
            if (ticketType.equals("Standard")) {
                ticketPrice = 110.10;
            } else if (ticketType.equals("Premium")) {
                ticketPrice = 160.66;
            } else {
                ticketPrice = 400;
            }
        }
        double totalSum = ticketNum * ticketPrice;
        double finalSum = 0;

        if (totalSum > 4000) {
            finalSum = totalSum * 0.75;
            System.out.printf("%.2f", finalSum);
        } else if (totalSum > 2500 && totalSum <= 4000 && symbol.equals("Y")) {
            finalSum = totalSum * 0.9 + ticketNum * 40;
            System.out.printf("%.2f", finalSum);
        } else if (totalSum > 2500 && totalSum <= 4000 && symbol.equals("N")) {
            finalSum = totalSum * 0.9;
            System.out.printf("%.2f", finalSum);
        } else if (totalSum <= 2500 && symbol.equals("N")){
            System.out.printf("%.2f", ticketNum * ticketPrice);
        } else if (totalSum <= 2500 && symbol.equals("Y")) {
            finalSum = totalSum + ticketNum * 40;
            System.out.printf("%.2f", finalSum);
        }

    }
}

