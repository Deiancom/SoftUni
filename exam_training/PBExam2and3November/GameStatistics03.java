package ProgrammingBasics.exam_training.PBExam2and3November;

import java.util.Scanner;

public class GameStatistics03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        matchTime(time);
        matchImpact(time, name);
    }

    private static void matchImpact(int time, String name) {
        if (time > 0 && time <= 10) {
            System.out.printf("%s missed a penalty.%n", name);
            if (time % 2 == 0) {
                System.out.printf("%s was injured after penalty.", name);
            }
        } else if (time > 10 && time <= 35) {
            System.out.printf("%s received yellow card.%n", name);
            if (time % 2 != 0) {
                System.out.printf("%s got another yellow card.", name);
            }
        } else if (time > 35 && time < 45) {
            System.out.printf("%s SCORED A GOAL !!!", name);
        } else if (time > 45 && time <= 55) {
            System.out.printf("%s got a freekick.%n", name);
            if (time % 2 == 0) {
                System.out.printf("%s missed the freekick.", name);
            }
        } else if (time > 55 && time <= 80) {
            System.out.printf("%s missed a shot from corner.%n", name);
            if (time % 2 != 0) {
                System.out.printf("%s has been changed with another player.", name);
            }
        } else {
            System.out.printf("%s SCORED A GOAL FROM PENALTY !!!", name);
        }
    }

    private static void matchTime(int time) {
        if (time == 0) {
            System.out.println("Match has just began!");
        } else if (time > 0 && time < 45) {
            System.out.println("First half time.");
        } else {
            System.out.println("Second half time.");
        }
    }
}
