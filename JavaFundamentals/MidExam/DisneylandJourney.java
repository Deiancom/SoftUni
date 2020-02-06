package JavaFundamentals.MidExam;

import java.util.Scanner;

public class DisneylandJourney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceOfJourney = Double.parseDouble(scanner.nextLine());
        int monthsNumber = Integer.parseInt(scanner.nextLine());
        double moneySave = 0;
        int counterSpent = 0;
        int counterBonus = 0;
        for (int i = 0; i < monthsNumber; i++) {
            counterSpent++;
            counterBonus++;
            if (counterSpent > 1 && counterSpent % 2 != 0) {
                moneySave -= moneySave * 0.16;
            }
            if (counterBonus == 4) {
                moneySave += moneySave * 0.25;
                counterBonus = 0;
            }
            moneySave += priceOfJourney * 0.25;
        }
        if (moneySave >= priceOfJourney) {
            System.out.printf("Bravo! You can go to Disneyland and you will have %.2flv. for souvenirs.", moneySave - priceOfJourney);
        } else {
            System.out.printf("Sorry. You need %.2flv. more.", priceOfJourney - moneySave);
        }
    }
}
