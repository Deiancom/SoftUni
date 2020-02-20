package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class ChristmasMarket_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double fantasy = Double.parseDouble(scanner.nextLine()) * 14.90;
        double horror = Double.parseDouble(scanner.nextLine()) * 9.80;
        double romance = Double.parseDouble(scanner.nextLine()) * 4.30;
        double sumBeforeVat = fantasy + horror + romance;
        double afterVat = sumBeforeVat - sumBeforeVat * 0.20;
        double bonus = afterVat - neededMoney;
        double bonusSum;
        if (afterVat >= neededMoney) {
            bonusSum = Math.floor(bonus * 0.10);
            System.out.printf("%.2f leva donated.%n", afterVat - bonusSum);
            System.out.printf("Sellers will receive %.0f leva.", bonusSum);
        } else {
            System.out.printf("%.2f money needed.", neededMoney - afterVat);
        }

    }
}
