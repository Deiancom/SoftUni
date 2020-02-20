package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class Shopping_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCardNumber = Integer.parseInt(scanner.nextLine());
        int processorsNumber = Integer.parseInt(scanner.nextLine());
        int ramNumber = Integer.parseInt(scanner.nextLine());
        double videoCardsPrice = videoCardNumber * 250;
        double processorsPrice = videoCardsPrice * 0.35 * processorsNumber;
        double ramPrice = videoCardsPrice * 0.10 * ramNumber;
        double finalSum = videoCardsPrice + processorsPrice + ramPrice;
        if (videoCardNumber > processorsNumber) {
            finalSum = finalSum - finalSum * 0.15;
        }
        if (budget >= finalSum) {
            System.out.printf("You have %.2f leva left!",budget - finalSum);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!",finalSum - budget);
        }


    }
}
