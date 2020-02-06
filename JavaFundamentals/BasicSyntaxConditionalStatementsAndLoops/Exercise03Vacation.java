package JavaFundamentals.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Exercise03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfPeople = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double price = 0;
        switch (typeOfPeople) {
            case "Students":
                switch (dayOfWeek) {
                    case "Friday":
                        price = 8.45 * numberOfPeople;
                        break;
                    case "Saturday":
                        price = 9.80 * numberOfPeople;
                        break;
                    case "Sunday":
                        price = 10.46 * numberOfPeople;
                        break;
                }
                if (numberOfPeople >= 30) {
                    price -= price * 0.15;
                }
                break;
            case "Business":
                if (numberOfPeople >= 100) {
                    numberOfPeople -= 10;
                }
                switch (dayOfWeek) {
                    case "Friday":
                        price = 10.90 * numberOfPeople;
                        break;
                    case "Saturday":
                        price = 15.60 * numberOfPeople;
                        break;
                    case "Sunday":
                        price = 16 * numberOfPeople;
                        break;
                }
                break;
            case "Regular":
                switch (dayOfWeek) {
                    case "Friday":
                        price = 15 * numberOfPeople;
                        break;
                    case "Saturday":
                        price = 20 * numberOfPeople;
                        break;
                    case "Sunday":
                        price = 22.50 * numberOfPeople;
                        break;
                }
                if (numberOfPeople >= 10 && numberOfPeople <= 20) {
                    price -= price * 0.05;
                }
                break;
        }
        System.out.printf("Total price: %.2f", price);
    }
}

