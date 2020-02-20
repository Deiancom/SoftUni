package ProgrammingBasics.exam_training.PBExam2and3November;

import java.util.Scanner;

public class GameInfo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String teamName = scanner.nextLine();
        int matches = Integer.parseInt(scanner.nextLine());
        int time = 0;
        int penalties = 0;
        int addTime = 0;
        for (int i = 0; i < matches; i++) {
            int playTime = Integer.parseInt(scanner.nextLine());
            time += playTime;
            if (playTime > 90 && playTime <= 120) {
                addTime++;
            } else if (playTime > 120) {
                penalties++;
            }
        }
        double averageTime = time / (double) matches;
        System.out.printf("%s has played %d minutes. Average minutes per game: %.2f%n", teamName, time, averageTime);
        System.out.println("Games with penalties: " + penalties);
        System.out.println("Games with additional time: " + addTime);
    }
}
