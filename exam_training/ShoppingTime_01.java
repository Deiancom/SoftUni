package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class ShoppingTime_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int restTime = Integer.parseInt(scanner.nextLine());
        double hardwarePrice = Double.parseDouble(scanner.nextLine());
        double softwarePrice = Double.parseDouble(scanner.nextLine());
        double whiteFrapePrice = Double.parseDouble(scanner.nextLine());
        int relaxingTime = restTime - 15;
        double hardwareSum = hardwarePrice * 3;
        double softwareSum = softwarePrice * 2;
        double sum = hardwareSum + softwareSum + whiteFrapePrice;
        System.out.printf("%.2f%n", sum);
        System.out.printf("%d",relaxingTime);
    }
}
