package ProgrammingBasics.exam_training.PBExam9and10March;

import java.util.Scanner;

public class TennisEquipment01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceOfTennisRocket = Double.parseDouble(scanner.nextLine());
        int numberOfTennisRockets = scanner.nextInt();
        int numberOfSnickers = scanner.nextInt();
        double snickersPrice = (priceOfTennisRocket / 6) * numberOfSnickers;
        double rocketPrice = numberOfTennisRockets * priceOfTennisRocket;
        double price = snickersPrice + rocketPrice;
        price += price * 0.20;
        System.out.printf("Price to be paid by Djokovic %.0f%n", Math.floor(price * 0.125));
        System.out.printf("Price to be paid by sponsors %.0f", Math.ceil(price * 0.875));
    }
}
