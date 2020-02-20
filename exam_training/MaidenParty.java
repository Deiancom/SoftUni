package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double excursionPrice = Double.parseDouble(scanner.nextLine());
        int puzzlesCount = Integer.parseInt(scanner.nextLine());
        int talkingDollsCount = Integer.parseInt(scanner.nextLine());
        int teddyBearsCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());
        double puzzlesPrice = puzzlesCount * 0.60;
        double talkingDollsPrice = talkingDollsCount * 7.2;
        double teddyBearsPrice = teddyBearsCount * 3.60;
        double minionsPrice = minionsCount * 18.20;
        double trucksPrice = trucksCount * 22;
        double profitBeforeExpenses = puzzlesPrice + talkingDollsPrice + teddyBearsPrice + minionsPrice + trucksPrice;
        double toysCount = puzzlesCount + talkingDollsCount + teddyBearsCount + minionsCount + trucksCount;
        if (toysCount >= 25) {
            profitBeforeExpenses = profitBeforeExpenses - (profitBeforeExpenses * 0.35);
        }
        profitBeforeExpenses = profitBeforeExpenses - (profitBeforeExpenses * 0.10);
        if (profitBeforeExpenses >= excursionPrice) {
            System.out.printf("Yes! %.2f lv left.", profitBeforeExpenses - excursionPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", excursionPrice - profitBeforeExpenses);
        }
    }
}

