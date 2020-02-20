package ProgrammingBasics.exam_training.PBExam9and10March;

import java.util.Scanner;

public class GameNumberWars04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstPlayerName = scanner.nextLine();
        String secondPlayerName = scanner.nextLine();

        int firstPlayerPoints = 0;
        int secondPlayerPoints = 0;
        String firstCommand = scanner.nextLine();
        while (!firstCommand.equals("End of game")) {
            int firstPlayerCard = Integer.parseInt(firstCommand);
            int secondPlayerCard = Integer.parseInt(scanner.nextLine());
            if (firstPlayerCard > secondPlayerCard) {
                firstPlayerPoints += firstPlayerCard - secondPlayerCard;
            } else if (firstPlayerCard < secondPlayerCard) {
                secondPlayerPoints += secondPlayerCard - firstPlayerCard;
            } else {
                firstPlayerCard = scanner.nextInt();
                secondPlayerCard = scanner.nextInt();
                System.out.println("Number wars!");
                if (firstPlayerCard > secondPlayerCard) {
                    System.out.printf("%s is winner with %d points", firstPlayerName, firstPlayerPoints);
                } else {
                    System.out.printf("%s is winner with %d points", secondPlayerName, secondPlayerPoints);
                }
                return;
            }
            firstCommand = scanner.nextLine();
        }
        System.out.printf("%s has %d points%n", firstPlayerName, firstPlayerPoints);
        System.out.printf("%s has %d points", secondPlayerName, secondPlayerPoints);
    }
}
