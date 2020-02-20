package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class GroupStage_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String teamName = scanner.nextLine();
        int matchesNumber = Integer.parseInt(scanner.nextLine());
        int points = 0;
        int scoredGoals = 0;
        int receivedGoals = 0;
        for (int i = 0; i < matchesNumber; i++) {
            int scored = Integer.parseInt(scanner.nextLine());
            int received = Integer.parseInt(scanner.nextLine());
            scoredGoals += scored;
            receivedGoals += received;
            if (scored > received) {
                points += 3;
            } else if (scored == received) {
                points += 1;
            }
        }
        if (scoredGoals >= receivedGoals) {
            System.out.printf("%s has finished the group phase with %d points.\n" +
                    "Goal difference: %d.", teamName, points, scoredGoals - receivedGoals);
        } else {
            System.out.printf("%s has been eliminated from the group phase.\n" +
                    "Goal difference: -%d.", teamName, receivedGoals - scoredGoals);
        }
    }
}
