package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class FootballKit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tShirtPrice = Double.parseDouble(scanner.nextLine());
        double priceNeededForBall = Double.parseDouble(scanner.nextLine());
        double shortsPrice = tShirtPrice * 0.75;
        double socksPrice = shortsPrice * 0.20;
        double shoesPrice = (shortsPrice + tShirtPrice) * 2;
        double sumForClothes = tShirtPrice + shoesPrice + socksPrice + shortsPrice;
        double finalSum = sumForClothes - sumForClothes * 0.15;
        if (finalSum >= priceNeededForBall) {
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", finalSum);
        } else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", priceNeededForBall - finalSum);
        }
    }
}
