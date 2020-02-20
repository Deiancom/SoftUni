package ProgrammingBasics.exam_training.PBExam9and10March;

import java.util.Scanner;

public class TennisRanklist05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tournamentNumber = Double.parseDouble(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());
        double points = 0;
        int wins = 0;
        for (int i = 0; i < tournamentNumber; i++) {
            String place = scanner.nextLine();
            if (place.equals("W")) {
                wins++;
                points += 2000;
                startingPoints += 2000;
            } else if (place.equals("F")) {
                points += 1200;
                startingPoints += 1200;
            } else {
                points += 720;
                startingPoints += 720;
            }
        }
        double averagePoints = Math.floor(points / tournamentNumber);
        double percent = (wins / tournamentNumber) * 100;
        System.out.printf("Final points: %d%n", startingPoints);
        System.out.printf("Average points: %.0f%n", averagePoints);
        System.out.printf("%.2f%%", percent);
    }
}
