package JavaFundamentals.ExamsPreparation.MidExams.MidExam02NovemberGroup2;

import java.util.*;

public class ExperienceGaining01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededExperience = Double.parseDouble(scanner.nextLine());
        int battlesCount = Integer.parseInt(scanner.nextLine());
        double experience = 0;
        int counter15Percent = 0;
        int counter10Percent = 0;
        for (int i = 1; i <= battlesCount; i++) {
            double points = Double.parseDouble(scanner.nextLine());
            counter10Percent++;
            counter15Percent++;
            if (counter15Percent == 3) {
                points += points * 0.15;
                counter15Percent = 0;
            } else if (counter10Percent == 5) {
                points -= points * 0.10;
                counter10Percent = 0;
            }
            experience += points;
            if (experience >= neededExperience) {
                System.out.printf("Player successfully collected his needed experience for %d battles.", i);
                return;
            }
        }
        System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", neededExperience - experience);
    }
}
