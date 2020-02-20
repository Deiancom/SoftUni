package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class GameInfo_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String teamName = scanner.nextLine();
        int gamesPlayed = Integer.parseInt(scanner.nextLine());
        int timePlayed = 0;
        int gamesWithPenalties = 0;
        int gamesWithAddTime = 0;
        for (int i = 0; i < gamesPlayed; i++) {
            int gameTime = Integer.parseInt(scanner.nextLine());
            timePlayed += gameTime;
            if (gameTime > 90 && gameTime <= 120) {
                gamesWithAddTime++;
            } else if (gameTime > 120) {
                gamesWithPenalties++;
            }

        }
        double averageTime = timePlayed / (double) gamesPlayed;
        System.out.printf("%s has played %d minutes. Average minutes per game: %.2f%n", teamName, timePlayed, averageTime);
        System.out.printf("Games with penalties: %d%n", gamesWithPenalties);
        System.out.printf("Games with additional time: %d", gamesWithAddTime);
    }
}
