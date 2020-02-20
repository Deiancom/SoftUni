package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class TripToWorldCup_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double goTicket = Double.parseDouble(scanner.nextLine()) * 6;
        double returnTicket = Double.parseDouble(scanner.nextLine()) * 6;
        double machTicket = Double.parseDouble(scanner.nextLine()) * 6;
        int machNumber = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine()) /100;
        double tripPrice = goTicket + returnTicket;
        double finalTripPrice = tripPrice - tripPrice * discount;
        double priceForMaches = machTicket * machNumber;
        double finalSum = finalTripPrice + priceForMaches;
        double pricePerFriend = finalSum / 6;

        System.out.printf("Total sum: %.2f lv.%n", finalSum);
        System.out.printf("Each friend has to pay %.2f lv.", pricePerFriend);

    }
}
