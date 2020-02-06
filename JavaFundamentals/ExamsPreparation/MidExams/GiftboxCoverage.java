package JavaFundamentals.ExamsPreparation.MidExams;

import java.util.Scanner;

public class GiftboxCoverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sideSize = Double.parseDouble(scanner.nextLine());
        double allArea = sideSize * sideSize * 6;
        int paperNumber = Integer.parseInt(scanner.nextLine());
        double areaFromOneSheet = Double.parseDouble(scanner.nextLine());
        double coverArea = 0;
        int counter = 0;
        for (int i = 0; i < paperNumber; i++) {
            counter++;
            if (counter == 3) {
                double test = areaFromOneSheet * 0.25;
                counter = 0;
                coverArea += test;
            } else {
                coverArea += areaFromOneSheet;
            }
        }
        double percent = coverArea / allArea * 100;

        System.out.printf("You can cover %.2f%% of the box.", Math.abs(percent));
    }
}
