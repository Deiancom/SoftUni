package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class FootballTournament_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String footballTeam = scanner.nextLine();
        int gamesPlayed = Integer.parseInt(scanner.nextLine());
        if (gamesPlayed == 0) {
            System.out.printf("%s hasn't played any games during this season.", footballTeam);
            return;
        }
        int wins = 0;
        int draws = 0;
        int lost = 0;
        int points = 0;
        double percent = gamesPlayed / 100.0;

        for (int i = 0; i < gamesPlayed; i++) {
            String result = scanner.nextLine();
            switch (result) {
                case "W":
                    wins++;
                    points += 3;
                    break;
                case "D":
                    draws++;
                    points += 1;
                    break;
                case "L":
                    lost++;
                    break;
            }
        }
        percent = wins / percent;
        System.out.printf("%s has won %d points during this season.%n", footballTeam, points);
        System.out.println("Total stats:");
        System.out.printf("## W: %d%n", wins);
        System.out.printf("## D: %d%n", draws);
        System.out.printf("## L: %d%n", lost);
        System.out.printf("Win rate: %.2f%%", percent);

    }
}
