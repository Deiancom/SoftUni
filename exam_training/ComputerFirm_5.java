package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class ComputerFirm_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int computersNumber = Integer.parseInt(scanner.nextLine());

        double ratingSum = 0;
        double sales = 0;

        for (int i = 0; i < computersNumber; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            int rating = input % 10;
            double possibleSales = input / 10.0;
            ratingSum += rating;
            if (rating == 3) {
                sales += possibleSales * 0.50;
            } else if (rating == 4) {
                sales += possibleSales * 0.70;
            } else if (rating == 5) {
                sales += possibleSales * 0.85;
            } else if (rating == 6) {
                sales += possibleSales;
            }

        }
        System.out.printf("%.2f%n", sales);
        System.out.printf("%.2f", ratingSum / computersNumber);
    }
}
