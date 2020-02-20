package ProgrammingBasics.exam_training.PBExam9and10March;

import java.util.Scanner;

public class Darts04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();
        int successfulShots = 0;
        int unsuccessfulShots = 0;
        int points = 301;
        String command = scanner.nextLine();
        while (!command.equals("Retire")) {
            int point = Integer.parseInt(scanner.nextLine());
            if (command.equals("Single")) {
                if (point <= points) {
                    points -= point;
                    successfulShots++;
                } else {
                    unsuccessfulShots++;
                }
            } else if (command.equals("Double")) {
                if (point * 2 <= points) {
                    points -= point * 2;
                    successfulShots++;
                } else {
                    unsuccessfulShots++;
                }
            } else {
                if (point * 3 <= points) {
                    points -= point * 3;
                    successfulShots++;
                } else {
                    unsuccessfulShots++;
                }
            }
            if (points == 0) {
                System.out.printf("%s won the leg with %d shots.", playerName, successfulShots);
                return;
            }
            command = scanner.nextLine();
        }
        System.out.printf("%s retired after %d unsuccessful shots.", playerName, unsuccessfulShots);

    }
}
