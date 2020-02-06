package JavaFundamentals.ExamsPreparation.MidExams.MidExamRetake06August;

import java.util.*;

public class BlackFlag01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());
        int counter3Days = 0;
        int counter5Days = 0;
        double plunder = 0;
        for (int i = 1; i <= days; i++) {
            counter5Days++;
            counter3Days++;
            plunder += dailyPlunder;
            if (counter3Days == 3) {
                plunder += dailyPlunder / 2.0;
                counter3Days = 0;
            }
            if (counter5Days == 5) {
                plunder -= plunder * 0.30;
                counter5Days = 0;
            }
        }
        double percent = plunder / expectedPlunder * 100;
        if (plunder >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", plunder);
        } else {
            System.out.printf("Collected only %.2f%% of the plunder.", percent);
        }
    }
}
