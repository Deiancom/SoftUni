package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class Series_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int serialsNum = Integer.parseInt(scanner.nextLine());
        double price = 0;
        for (int i = 0; i < serialsNum ; i++) {
            String serialName = scanner.nextLine();
            double serialPrice = Double.parseDouble(scanner.nextLine());
            if (serialName.equals("Thrones")) {
                price += serialPrice / 2;
            } else if (serialName.equals("Lucifer")) {
                price += serialPrice * 0.60;
            } else if (serialName.equals("Protector")) {
                price += serialPrice * 0.70;
            } else if (serialName.equals("TotalDrama")) {
                price += serialPrice * 0.80;
            } else if (serialName.equals("Area")) {
                price += serialPrice * 0.90;
            } else {
                price += serialPrice;
            }

        }
        if (budget >= price) {
            System.out.printf("You bought all the series and left with %.2f lv.", budget - price);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!",price - budget);
        }
    }
}
