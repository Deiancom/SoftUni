package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class SeaTrip_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double foodMoney = Double.parseDouble(scanner.nextLine());
        double souvenirsMoney = Double.parseDouble(scanner.nextLine());
        double hotelMoney = Double.parseDouble(scanner.nextLine());
        double fuelPrice = 54.39;
        double foodAndSouvenirsMoney = (souvenirsMoney * 3) + (foodMoney * 3);
        double firstDay = hotelMoney * 0.90;
        double secondDay = hotelMoney * 0.85;
        double thirdDay = hotelMoney * 0.80;
        hotelMoney = firstDay + secondDay + thirdDay;
        double allSum = fuelPrice + foodAndSouvenirsMoney + hotelMoney;
        System.out.printf("Money needed: %.2f",allSum);
    }
}
