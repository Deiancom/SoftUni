package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class FilmPremiere_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        String snack = scanner.nextLine();
        int ticketsNumber = Integer.parseInt(scanner.nextLine());
        double price;
        if (movieName.equals("Star Wars")) {
            if (snack.equals("Drink")) {
                price = 18 * ticketsNumber;
            } else if (snack.equals("Popcorn")) {
                price = 25 * ticketsNumber;
            } else {
                price = 30 * ticketsNumber;
            }
            if (ticketsNumber >= 4) {
                price = price - price * 0.30;
            }
        } else if (movieName.equals("Jumanji")) {
            if (snack.equals("Drink")) {
                price = 9 * ticketsNumber;
            } else if (snack.equals("Popcorn")) {
                price = 11 * ticketsNumber;
            } else {
                price = 14 * ticketsNumber;
            }
            if (ticketsNumber == 2) {
                price = price - price * 0.15;
            }
        } else {
            if (snack.equals("Drink")) {
                price = 12 * ticketsNumber;
            } else if (snack.equals("Popcorn")) {
                price = 15 * ticketsNumber;
            } else {
                price = 19 * ticketsNumber;
            }
        }
        System.out.printf("Your bill is %.2f leva.", price);

    }
}
