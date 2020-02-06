package JavaFundamentals.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Snowballs11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int snowballNumber = Integer.parseInt(scanner.nextLine());
        int snowBest = 0;
        int timeBest = 0;
        int qualityBest = 0;
        double valueBest = 0;

        for (int i = 0; i < snowballNumber ; i++) {
            int snow = Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
            int quality = Integer.parseInt(scanner.nextLine());
            int value = snow / time;
            double snowballValue = Math.pow(value, quality);
            if (snowballValue > valueBest) {
                snowBest = snow;
                timeBest = time;
                qualityBest = quality;
                valueBest = snowballValue;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)",snowBest,timeBest,valueBest,qualityBest);
    }
}
