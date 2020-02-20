package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class BestPlayer_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String bestPlayer = "";
        int goalsMax = 0;
        boolean hattrick = false;
        while (!input.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals > goalsMax) {
                goalsMax = goals;
                bestPlayer = input;
            }
            if (goalsMax >= 3) {
                hattrick = true;
            }
            if (goalsMax >= 10) {
                break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n", bestPlayer);
        if (hattrick) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", goalsMax);
        } else {
            System.out.printf("He has scored %d goals.", goalsMax);
        }
    }
}
