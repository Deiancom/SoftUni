package ProgrammingBasics.exam_training.PBExam2and3November;

import java.util.Scanner;

public class BraceletStand02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double savedMoney = Double.parseDouble(scanner.nextLine()) * 5;
        double profit = Double.parseDouble(scanner.nextLine()) * 5;
        double expenses = Double.parseDouble(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());
        double finalSum = savedMoney + profit - expenses;
        if (finalSum >= giftPrice) {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", finalSum);
        } else {
            System.out.printf("Insufficient money: %.2f BGN.", giftPrice - finalSum);
        }
    }
}
