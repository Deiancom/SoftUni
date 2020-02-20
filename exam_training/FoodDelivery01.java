package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class FoodDelivery01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double chickenMenu = Double.parseDouble(scanner.nextLine()) * 10.35;
        double fishMenu = Double.parseDouble(scanner.nextLine()) * 12.40;
        double veggieMenu = Double.parseDouble(scanner.nextLine()) * 8.15;
        double midSum = chickenMenu + fishMenu + veggieMenu;
        midSum += midSum * 0.20;
        double sum = midSum + 2.50;
        System.out.printf("Total: %.2f", sum);
    }
}
