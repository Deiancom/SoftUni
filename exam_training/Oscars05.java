package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class Oscars05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int judgesCount = Integer.parseInt(scanner.nextLine());
        boolean getNomination = false;
        for (int i = 0; i < judgesCount; i++) {
            String nameOfJudge = scanner.nextLine();
            double pointsFromJudge = Double.parseDouble(scanner.nextLine());
            double currentPoints = (nameOfJudge.length() * pointsFromJudge) / 2;
            academyPoints += currentPoints;
            if (academyPoints > 1250.5) {
                getNomination = true;
                break;
            }
        }
        if (getNomination) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, academyPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - academyPoints);
        }
    }
}
