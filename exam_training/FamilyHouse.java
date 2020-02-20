package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class FamilyHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        getAndPrint(scanner);
    }

    public static void getAndPrint(Scanner scanner) {
        int months = Integer.parseInt(scanner.nextLine());
        double electricity = 0;
        for (int i = 1; i <= months; i++) {
            double electricityBill = Double.parseDouble(scanner.nextLine());
            electricity += electricityBill;
        }
        double water = months * 20;
        double internet = months * 15;
        double others = electricity + water + internet;
        double othersSum = others + others * 0.20;
        double averageBill = (electricity + water + internet + othersSum) / months;
        System.out.printf("Electricity: %.2f lv%n", electricity);
        System.out.printf("Water: %.2f lv%n", water);
        System.out.printf("Internet: %.2f lv%n", internet);
        System.out.printf("Other: %.2f lv%n", othersSum);
        System.out.printf("Average: %.2f lv", averageBill);
    }
}
