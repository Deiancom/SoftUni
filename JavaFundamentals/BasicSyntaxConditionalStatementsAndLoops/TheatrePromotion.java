package JavaFundamentals.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfDay = scanner.nextLine().toLowerCase();
        int ageOfPerson = Integer.parseInt(scanner.nextLine());
        double priceOfTicket = 0;
        switch (typeOfDay) {
            case "weekday":
                if (ageOfPerson >= 0 && ageOfPerson <= 18) {
                    priceOfTicket = 12;
                } else if (ageOfPerson > 18 && ageOfPerson <= 64) {
                    priceOfTicket = 18;
                } else if (ageOfPerson > 64 && ageOfPerson <= 122) {
                    priceOfTicket = 12;
                } else {
                    System.out.print("Error!");
                    return;
                }
                break;
            case "weekend":
                if (ageOfPerson >= 0 && ageOfPerson <= 18) {
                    priceOfTicket = 15;
                } else if (ageOfPerson > 18 && ageOfPerson <= 64) {
                    priceOfTicket = 20;
                } else if (ageOfPerson > 64 && ageOfPerson <= 122) {
                    priceOfTicket = 15;
                } else {
                    System.out.print("Error!");
                    return;
                }
                break;
            case "holiday":
                if (ageOfPerson >= 0 && ageOfPerson <= 18) {
                    priceOfTicket = 5;
                } else if (ageOfPerson > 18 && ageOfPerson <= 64) {
                    priceOfTicket = 12;
                } else if (ageOfPerson > 64 && ageOfPerson <= 122) {
                    priceOfTicket = 10;
                } else {
                    System.out.print("Error!");
                    return;
                }
                break;
        }
        System.out.printf("%.0f$", priceOfTicket);
    }
}
