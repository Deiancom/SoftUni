package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class PoolDay_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleNumber = Integer.parseInt(scanner.nextLine());
        double enterTax = Double.parseDouble(scanner.nextLine());
        double loungeChairPrice = Double.parseDouble(scanner.nextLine());
        double umbrelaPrice = Double.parseDouble(scanner.nextLine());
        double moneyFotEnter = peopleNumber * enterTax;
        double moneyForChairs = Math.ceil(peopleNumber * 0.75) * loungeChairPrice;
        double moneyForUmbrelas = Math.ceil(peopleNumber * 0.50) * umbrelaPrice;
        double finalPrice = moneyForChairs + moneyForUmbrelas + moneyFotEnter;
        System.out.printf("%.2f lv.",finalPrice);
    }
}
