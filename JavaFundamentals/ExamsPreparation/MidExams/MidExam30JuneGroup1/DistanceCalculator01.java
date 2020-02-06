package JavaFundamentals.ExamsPreparation.MidExams.MidExam30JuneGroup1;

import java.util.Scanner;

public class DistanceCalculator01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stepsMade = Integer.parseInt(scanner.nextLine());
        double lengthOfStep = Double.parseDouble(scanner.nextLine());
        int distanceToTravel = Integer.parseInt(scanner.nextLine()) * 100;
        double forRemove = Math.floor(stepsMade / 5.0);
        stepsMade -= forRemove;
        double shortSteps = (lengthOfStep * 0.70) * forRemove;
        double traveledDistance = stepsMade * lengthOfStep + shortSteps;
        double percent = traveledDistance / distanceToTravel * 100;
        System.out.printf("You travelled %.2f%% of the distance!", percent);
    }
}
