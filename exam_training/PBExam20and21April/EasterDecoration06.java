package ProgrammingBasics.exam_training.PBExam20and21April;

import java.util.Scanner;

public class EasterDecoration06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int clientsNumber = Integer.parseInt(scanner.nextLine());
        double moneySpend = 0.0;
        for (int i = 0; i < clientsNumber; i++) {
            double moneySpendPerClient = 0.0;
            int productsCount = 0;
            String command = scanner.nextLine();
            while (!command.equals("Finish")) {
                productsCount++;
                switch (command) {
                    case "basket":
                        moneySpendPerClient += 1.50;
                        break;
                    case "wreath":
                        moneySpendPerClient += 3.80;
                        break;
                    case "chocolate bunny":
                        moneySpendPerClient += 7;
                        break;
                }
                command = scanner.nextLine();

                if (productsCount % 2 == 0) {
                    moneySpendPerClient -= moneySpendPerClient * 0.20;
                }
            }
            System.out.printf("You purchased %d items for %.2f leva.%n", productsCount, moneySpendPerClient);
            moneySpend += moneySpendPerClient;
        }
        double percent = moneySpend / clientsNumber;
        System.out.printf("Average bill per client is: %.2f leva.", percent);
    }
}
