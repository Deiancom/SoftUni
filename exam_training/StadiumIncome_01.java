package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class StadiumIncome_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sectorsInStadium = Integer.parseInt(scanner.nextLine());
        int capacityOfStadium = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        double incomeFromOneSector = (capacityOfStadium * ticketPrice) / sectorsInStadium;
        double incomeFromStadium = incomeFromOneSector * sectorsInStadium;
        double moneyForCharity = (incomeFromStadium - (incomeFromOneSector * 0.75)) / 8;
        System.out.printf("Total income - %.2f BGN%n", incomeFromStadium);
        System.out.printf("Money for charity - %.2f BGN", moneyForCharity);

    }
}
