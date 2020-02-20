package ProgrammingBasics.exam_training.PBExam9and10March;

import java.util.Scanner;

public class BasketballTournament06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tournamentName = scanner.nextLine();
        int wins = 0;
        int lose = 0;
        int matches = 0;
        while (!tournamentName.equals("End of tournaments")) {
            int gameInTournament = Integer.parseInt(scanner.nextLine());
            for (int i = 1; i <= gameInTournament; i++) {
                matches++;
                int firstTeamResult = Integer.parseInt(scanner.nextLine());
                int secondTeamResult = Integer.parseInt(scanner.nextLine());
                if (firstTeamResult > secondTeamResult) {
                    wins++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", i, tournamentName, firstTeamResult - secondTeamResult);
                } else {
                    lose++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", i, tournamentName, secondTeamResult - firstTeamResult);
                }

            }
            tournamentName = scanner.nextLine();
        }
        double percentWins = ((double) wins / matches) * 100;
        double percentLost = ((double) lose / matches) * 100;
        System.out.printf("%.2f%% matches win%n", percentWins);
        System.out.printf("%.2f%% matches lost", percentLost);
    }
}
