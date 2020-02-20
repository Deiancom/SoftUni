package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class BachelorParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guestArtistHonorar = Integer.parseInt(scanner.nextLine());
        int guest = 0;
        int money = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("The restaurant is full")) {
                break;
            }
            int numPeople = Integer.parseInt(input);
            guest += numPeople;

            if (numPeople < 5) {
                money += numPeople * 100;
            } else {
                money += numPeople * 70;
            }
        }

        if (money >= guestArtistHonorar) {
            System.out.printf("You have %d guests and %d leva left.", guest, money - guestArtistHonorar);
        } else {
            System.out.printf("You have %d guests and %d leva income, but no singer.", guest, money);
        }
    }
}
